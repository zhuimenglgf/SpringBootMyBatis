package com.zhuimeng.service.impl;

import com.zhuimeng.dao.UsersMapper;
import com.zhuimeng.pojo.Users;
import com.zhuimeng.pojo.UsersExample;
import com.zhuimeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/7/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public List<Users> selectByExample(UsersExample example) {
        return usersMapper.selectByExample(example);
    }

    @Override
    public Users selectByPrimaryKey(int userid) {
        return usersMapper.selectByPrimaryKey(userid);
    }
}
