package com.xhd.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhd.gulimall.common.utils.PageUtils;
import com.xhd.gulimall.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author xhd
 * @email 1365821818@qq.com
 * @date 2022-07-31 23:11:02
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

