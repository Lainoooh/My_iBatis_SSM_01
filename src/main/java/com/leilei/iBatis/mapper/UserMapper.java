package com.leilei.iBatis.mapper;

import com.leilei.iBatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * 存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 查找所有
     */
    List<User> findUserAll();

    /**
     * 根据id查用户
     */
    User findUserByUserId(int userId);

}
