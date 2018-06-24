package cn.ssmdemo.service.impl;

import cn.ssmdemo.dao.IUserDao;
import cn.ssmdemo.model.User;
import cn.ssmdemo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;


    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
