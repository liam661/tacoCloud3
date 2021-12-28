package com.liam.taco3.dao;

import com.liam.taco3.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserMapperXMLTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapperXML userMapperXML;

    @Test
    public void testFindAll() {
        List<User> list = userMapperXML.findAll();
        list.forEach(user -> {
            logger.info("user={}", user);
        });
    }

    @Test
    public void testFindById(){
        logger.info("user={}", userMapperXML.findById(1L));
    }

    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("测试");
        user.setPassword("123");
        user.setCreateTime(new Date());
        userMapperXML.save(user);
        testFindAll();
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(4L);
        user.setUsername("测试呀");
        userMapperXML.update(user);
        testFindAll();
    }

    @Test
    public void delete() {
        userMapperXML.delete(3L);
        testFindAll();
    }

}