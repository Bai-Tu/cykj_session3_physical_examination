package com.service.impl;

import com.mapper.PhyPatientMapper;
import com.pojo.PhyPatient;
import com.service.PatientService;
import com.util.ResponseDTO;
import com.vo.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李璟瑜
 * @date 2024/8/8 9:20
 * @description:
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PhyPatientMapper mapper;
    @Override
    public ResponseDTO registerPatient(RegisterVo vo) {
        int result = 0;
        if (vo.getAcc().length() == 11){
            PhyPatient patient = mapper.searchPatientByPhone(vo.getAcc());
            if (patient == null){
                result = mapper.registerByPhone(vo);
                if (result >= 0){
                    return ResponseDTO.success();
                }else {
                    return new ResponseDTO(-100,"注册失败",null);
                }
            }else {
                return new ResponseDTO(-1,"账号已存在",null);
            }
        }else {
            PhyPatient patient = mapper.searchPatientByIdentity(vo.getAcc());
            if (patient == null){
                result = mapper.registerByIdentity(vo);
                if (result >= 0){
                    return ResponseDTO.success();
                }else {
                    return new ResponseDTO(-100,"注册失败",null);
                }
            }else {
                return new ResponseDTO(-1,"账号已存在",null);
            }
        }
    }
}
