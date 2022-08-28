package com.xhd.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhd.gulimall.common.utils.PageUtils;
import com.xhd.gulimall.entity.UmsGrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author xhd
 * @email 1365821818@qq.com
 * @date 2022-07-31 23:13:04
 */
public interface UmsGrowthChangeHistoryService extends IService<UmsGrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

