package com.test.service;

import com.test.domain.User;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yzy
 * @date 2020/7/31
 * @describe
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int insert(User user){
        return userMapper.insert(user);
    }
}
