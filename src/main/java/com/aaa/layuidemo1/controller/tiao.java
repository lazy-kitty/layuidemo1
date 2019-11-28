package com.aaa.layuidemo1.controller;

import com.aaa.layuidemo1.entity.catagory;
import com.aaa.layuidemo1.entity.product;
import com.aaa.layuidemo1.service.productService;
import com.aaa.layuidemo1.util.FenyeResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("cha")
@RestController
public class tiao {
    @Resource
    productService product;

    @RequestMapping("zhu")
    @ResponseBody
    public Map<String, Object> aa(Integer page, Integer limit){
        Map<String, Object> map = new HashMap<>();
        map.put("page", (page - 1) * limit);
        map.put("limit", limit);
        List<product> products = product.selectAll(map);
        Integer count = product.select1(map);
        return FenyeResult.fenye(products, count);
    }
    @RequestMapping("delete")
    @ResponseBody
    public boolean delete(Integer productid){
        boolean delete = product.delete(productid);
        return delete;
    }
    @RequestMapping("selectName")
    @ResponseBody
    public List<Map<String, Object>>  name(){
        List<catagory> list = product.select2();
        List<Map<String, Object>> list2=new ArrayList<Map<String, Object>>();
        for (catagory ca:list) {
            Map<String, Object> map=new HashMap<String, Object>();
            Integer id=ca.getCatagoryid();
            String name=ca.getCatagoryname();
            map.put("name", name);
            map.put("id", id);
            list2.add(map);

        }
        return list2;
    }
    @RequestMapping("selectId")
    @ResponseBody
    public int selectId(product p){
      String catagoryname=p.getCatagoryname();
        int id = product.selectId(catagoryname);
        return id;
    }
    @RequestMapping("add")
    @ResponseBody
    public boolean add(product p){
        boolean add = product.add(p);

        return add;
    }
    @RequestMapping("update")
    @ResponseBody
    public boolean update(product p){
        boolean update = product.update(p);

        return update;
    }
}
