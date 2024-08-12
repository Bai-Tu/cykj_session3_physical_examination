package com.service;

import com.util.ResponseDTO;
import com.vo.PageVo;
import com.vo.SearchPageVo;
import org.springframework.stereotype.Service;

/**
 * @author 李璟瑜
 * @date 2024/8/12 20:40
 * @description:
 */

public interface ComboService {
    ResponseDTO getAllComboByPage(PageVo vo);
    ResponseDTO searchCombo(SearchPageVo vo);

}
