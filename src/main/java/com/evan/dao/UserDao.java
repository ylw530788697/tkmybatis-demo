package com.evan.dao;

import com.evan.model.UserModel;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author evanYang
 * @version 1.0
 * @date 08/27/2019 15:06
 */
public interface UserDao extends Mapper<UserModel> {
    List<UserModel> selectUserBy();
}
