package com.baizhi.test;

import com.baizhi.App;
import com.baizhi.dao.AdminMapper;
import com.baizhi.entity.Admin;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class Test111 {
    @Autowired
    private AdminMapper am;
    @Test
    public void a(){
        User u = new User();
        Admin admin = am.selectByPrimaryKey("22");
        System.out.println(admin);
    }
}
