package com.xhd.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhd.gulimall.common.utils.PageUtils;
import com.xhd.gulimall.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author xhd
 * @email 1365821818@qq.com
 * @date 2022-07-31 17:35:02
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

