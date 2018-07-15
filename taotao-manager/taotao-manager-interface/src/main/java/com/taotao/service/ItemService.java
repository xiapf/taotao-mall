package com.taotao.service;

import com.taotao.pojo.TbItem;

/**
 * @Description: 商品管理服务
 * @Package: com.taotao.service
 * @Author: xiapf
 * @Date: 2018/7/15 18:13
 * @Version: 1.0
 */
public interface ItemService {
    TbItem getItemById(long itemId);
}
