package com.aaa.layuidemo1.mapper;

import com.aaa.layuidemo1.entity.catagory;
import com.aaa.layuidemo1.entity.product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface productMapper {
List<product> selectAll(Map<String, Object> map);
    Integer select1(Map<String, Object> map);
    //删除
    int delete(Integer productid);
    //查询商品类型
    List<catagory>select2();
    //添加
    int add (product p);
    //根据类型查id
    int selectId(String catagoryname);
    //修改
    int update(product p);
}
