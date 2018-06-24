package cn.ssmdemo.dao;

import cn.ssmdemo.model.User;

public interface IUserDao {
    User selectUser(long id);
}
