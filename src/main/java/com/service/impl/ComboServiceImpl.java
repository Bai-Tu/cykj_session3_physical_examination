package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.PhyComboMapper;
import com.pojo.PhyCombo;
import com.service.ComboService;
import com.util.ResponseDTO;
import com.vo.PageVo;
import com.vo.SearchPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李璟瑜
 * @date 2024/8/12 20:40
 * @description:
 */
@Service
public class ComboServiceImpl implements ComboService {

    @Autowired
    PhyComboMapper mapper;
    @Override
    public ResponseDTO getAllComboByPage(PageVo vo) {
        PageHelper.startPage(vo.getPagen(), vo.getLimit());
        List<PhyCombo> allCombo = mapper.getAllCombo();
        PageInfo<PhyCombo> pageInfo = new PageInfo<>(allCombo);
        return ResponseDTO.success(pageInfo);
    }

    @Override
    public ResponseDTO searchCombo(SearchPageVo vo) {
        PageHelper.startPage(vo.getPagen(), vo.getLimit());
        List<PhyCombo> phyCombos = mapper.searchCombo(vo);
        PageInfo<PhyCombo> pageInfo = new PageInfo<>(phyCombos);
        return ResponseDTO.success(pageInfo);
    }
}
