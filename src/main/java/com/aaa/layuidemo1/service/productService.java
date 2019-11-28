package com.aaa.layuidemo1.service;

import com.aaa.layuidemo1.entity.catagory;
import com.aaa.layuidemo1.entity.product;
import com.aaa.layuidemo1.mapper.productMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class productService {
       @Resource
     productMapper productMapper;
public List<product>selectAll(Map<String,Object> map){
    List<product> list = productMapper.selectAll(map);
    return list;
}
    public  Integer select1(Map<String, Object> map) {
        Integer count = productMapper.select1(map);
        return count;
    }
    public boolean delete(Integer productid){
        int i = productMapper.delete(productid);
        if(i==1){
            return true;
        }else{
            return false;
        }

    }
    public  List<catagory>select2(){
        List<catagory> list = productMapper.select2();
        return list;
    }
    public boolean add(product p){
        int i = productMapper.add(p);
        if(i==1){
            return true;
        }else{
            return false;
        }

    }
    public int selectId(String catagoryname){
       return productMapper.selectId(catagoryname);

    }
    public boolean update(product p){
        int i = productMapper.update(p);
        if(i==1){
            return true;
        }else{
            return false;
        }

    }
}
