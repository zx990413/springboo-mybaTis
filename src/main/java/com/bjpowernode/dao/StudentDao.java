package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 告诉MyBatis这是一个dao接口,创建此类接口的代理
 * 
 */

/*
* @Mapper 接口 放在dao接口的上面,且每一个接口都需要使用这个注解
* */

@Mapper
public interface StudentDao {


    Student selectById(@Param("stuId") Integer id);
}
