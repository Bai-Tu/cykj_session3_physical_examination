package com.mapper;

import com.pojo.PhyAdmin;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyAdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(PhyAdmin record);

    int insertSelective(PhyAdmin record);

    PhyAdmin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(PhyAdmin record);

    int updateByPrimaryKey(PhyAdmin record);
    PhyAdmin loginAdmin(@Param("acc") String acc, @Param("pwd") String pwd);
}