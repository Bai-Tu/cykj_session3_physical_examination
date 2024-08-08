package com.mapper;

import com.pojo.PhyAdmin;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李璟瑜
 * @date 2024/8/7 15:06
 * @description:
 */
public interface AdminMapper {
    PhyAdmin loginAdmin(@Param("acc") String acc,@Param("pwd") String pwd);
}
