package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.PhyOrderContextMapper;
import com.mapper.PhyOrderMapper;
import com.mapper.PhyPatientMapper;
import com.pojo.*;
import com.service.OrderListService;
import com.util.ResponseDTO;
import com.vo.OrderVo;
import com.vo.PageVo;
import com.vo.SearchPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李璟瑜
 * @date 2024/8/14 9:12
 * @description:
 */
@Service
public class OrderListServiceImpl implements OrderListService {
    @Autowired
    PhyOrderMapper mapper;

    @Autowired
    PhyPatientMapper patientMapper;

    @Autowired
    PhyOrderContextMapper orderContextMapper;

    @Override
    public ResponseDTO getOrderListByIdInPage(PageVo vo) {
        PageHelper.startPage(vo.getPagen(),vo.getLimit());
        List<PhyOrder> orderListByIdInPage = mapper.getOrderListByIdInPage(vo.getId());
        PageInfo<PhyOrder> pageInfo = new PageInfo<>(orderListByIdInPage);
        return ResponseDTO.success(pageInfo);
    }

    @Override
    public ResponseDTO searchOrderByIdInPage(SearchPageVo vo) {
        PageHelper.startPage(vo.getPagen(), vo.getLimit());
        List<PhyOrder> phyOrders = mapper.searchOrderByIdInPage(Integer.valueOf(vo.getIden()), vo.getName());
        PageInfo<PhyOrder> pageInfo = new PageInfo<>(phyOrders);
        return ResponseDTO.success(pageInfo);
    }

    @Override
    public ResponseDTO checkOutOrder(PhyOrder vo) {
        PhyPatient patient = patientMapper.selectByPrimaryKey(vo.getPatientId());
        int i = patient.getPatientBuddget().compareTo(vo.getOrderPrice());
        if (i < 0){
            return new ResponseDTO(-2,"余额不足",null);
        }else {
            patientMapper.checkOutOrder(vo.getPatientId(), vo.getOrderPrice());
            vo.setOrderStatus("1");
            int i1 = mapper.updateByPrimaryKeySelective(vo);
            return ResponseDTO.success(i1);
        }
    }


    @Override
    public ResponseDTO addOrder(OrderVo vo) {
        PhyOrder order = new PhyOrder();
        order.setOrderNumber(vo.getOrderNumber());
        order.setPatientId(vo.getPatientId());
        order.setOrderPrice(vo.getPrice());
        mapper.insertSelective(order);

        List<PhyCombo> combos = vo.getCombos();
        for (PhyCombo combo : combos) {
            PhyOrderContext context = new PhyOrderContext();
            context.setOrderNumber(vo.getOrderNumber());
            context.setComboId(combo.getComboId());
            orderContextMapper.insertSelective(context);
        }

        List<PhyProject> projects = vo.getProjects();
        for (PhyProject project : projects) {
            PhyOrderContext context = new PhyOrderContext();
            context.setOrderNumber(vo.getOrderNumber());
            context.setProjectId(project.getProjectId());
            orderContextMapper.insertSelective(context);
        }


        return ResponseDTO.success();
    }
}
