package com.service;

import com.util.ResponseDTO;
import com.vo.PageVo;
import com.vo.SearchPageVo;

/**
 * @author 李璟瑜
 * @date 2024/8/11 21:30
 * @description:
 */
public interface ProjectService {
    ResponseDTO getAllProject(PageVo vo);
    ResponseDTO searchProjectByName(SearchPageVo vo);
}
