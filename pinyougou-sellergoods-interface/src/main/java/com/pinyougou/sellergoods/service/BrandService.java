package com.pinyougou.sellergoods.service;

import entity.PageResult;
import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandService {

    public List<TbBrand> getBrandList();

    /**
     * 品牌分页列表
     * @param pageNum 当前页
     * @param pageSize 每页显示的数量
     * @return
     */
    public PageResult findPage(TbBrand tbBrand, int pageNum,int pageSize);

    /**
     * 添加品牌
     */
    public void add(TbBrand tbBrand);

    /**
     * 根据ID查询品牌
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     * 更新品牌
     * @param tbBrand
     */
    public void update(TbBrand tbBrand);

    /**
     * 删除
     * @param ids id 集合
     */
    public void delete(Long[] ids);
}
