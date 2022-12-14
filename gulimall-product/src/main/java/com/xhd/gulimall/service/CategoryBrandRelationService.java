package com.xhd.gulimall.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xhd.gulimall.common.utils.PageUtils;
import com.xhd.gulimall.entity.BrandEntity;
import com.xhd.gulimall.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;
/**
 * 品牌分类关联
 *
 * @author xhd
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);
}
