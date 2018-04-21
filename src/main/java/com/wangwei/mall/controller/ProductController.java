package com.wangwei.mall.controller;

import com.github.pagehelper.PageInfo;
import com.wangwei.mall.pojo.Product;
import com.wangwei.mall.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangwei on 2018/4/21.
 */
@Controller
public class ProductController {

    @Resource
    private IProductService productService;

    @RequestMapping(value = "/getPage")
    @ResponseBody
    public PageInfo getPage(){
        List<Product> products = productService.getListWithPage(1,2);
        PageInfo<Product> pageInfo = new PageInfo<>(products);
        List<Product> list = pageInfo.getList();
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPageSize());
        System.out.println(pageInfo.getPages());//总页数
        System.out.println(pageInfo.getTotal());//总记录数

        return pageInfo;
    }
}
