package cn.facilityone.dao;


import cn.facilityone.entity.User;

/**
 * Created by Yogi on 2016/7/20.
 */
public interface UserDAO extends BaseDAO<User>{

    int insert(User record);

    User getUserByAccount(String account);
}
