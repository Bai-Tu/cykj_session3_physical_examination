package com.mapper;

import com.pojo.PhyPatient;
import com.vo.RegisterVo;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyPatientMapper {
    int deleteByPrimaryKey(Integer patientId);

    int insert(PhyPatient record);

    int insertSelective(PhyPatient record);

    PhyPatient selectByPrimaryKey(Integer patientId);

    int updateByPrimaryKeySelective(PhyPatient record);

    int updateByPrimaryKey(PhyPatient record);
    //通过电话查询病人
    PhyPatient searchPatientByPhone(String phone);
    //根据身份证查询病人
    PhyPatient searchPatientByIdentity(String identity);

    //通过电话注册
    int registerByPhone(RegisterVo vo);
    //通过身份证注册
    int registerByIdentity(RegisterVo vo);
}