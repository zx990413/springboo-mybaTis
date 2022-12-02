package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.SturentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SturentServiceImpl implements SturentService {

//    自动注入
    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
