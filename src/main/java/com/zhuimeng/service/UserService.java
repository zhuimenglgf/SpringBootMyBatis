package com.zhuimeng.service;

import com.zhuimeng.pojo.Users;
import com.zhuimeng.pojo.UsersExample;

import java.util.List;

/**
 * Created by Administrator on 2018/7/25.
 */
public interface UserService {
    int insert(Users record);
    List<Users> selectByExample(UsersExample example);
    Users selectByPrimaryKey(int userid);
}
