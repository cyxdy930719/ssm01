package com.neuedu.service;

import com.neuedu.dao.UserDao;
import com.neuedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
/*@Repository
@Component
@Service
@Controller*/
@Service
public class UserServiceImpl implements IUserService {
    /*自动去容器找*/
    @Autowired
    private UserDao dao;
    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }
}
