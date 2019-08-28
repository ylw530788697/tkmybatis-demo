package com.evan.controller;


import com.alibaba.fastjson.JSONObject;
import com.evan.dao.UserDao;
import com.evan.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author evanYang
 * @version 1.0
 * @date 08/27/2019 15:08
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/getUser")
    public String index() {
        Example example = new Example(UserModel.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", "1");
        criteria.andEqualTo("userName", "evan11");
        //criteria.
        //criteria.
        List<UserModel> userModels = userDao.selectByExample(example);
        return JSONObject.toJSONString(userModels);
    }

    @GetMapping("/selectUserByMe")
    public List<UserModel> selectUserByMe() {
        List<UserModel> userModels = userDao.selectUserBy();
        return userModels;
    }
}
