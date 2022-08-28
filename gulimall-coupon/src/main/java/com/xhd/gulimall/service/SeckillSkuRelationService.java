package com.xhd.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhd.gulimall.common.utils.PageUtils;
import com.xhd.gulimall.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author xhd
 * @email 1365821818@qq.com
 * @date 2022-07-31 17:35:02
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

