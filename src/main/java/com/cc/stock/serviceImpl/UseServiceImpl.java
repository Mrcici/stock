package com.cc.stock.serviceImpl;

import com.cc.stock.dao.UserDao;
import com.cc.stock.entity.User;
import com.cc.stock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UseServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User Login(String username, String password) {
        // TODO Auto-generated method stub
        User user = userDao.findByUsername(username, password);
        if (user!=null&&password.equals(user.getPassword())) {
            return user;
        }
        return null;
    }

    public User Check(String username) {
        User user = userDao.checkByUsername(username);
        if (user!=null){
            return user;
        }else {
            return null;
        }
    }

    public void Regist(String username, String password) {
        userDao.addUser(username,password);
    }

}
