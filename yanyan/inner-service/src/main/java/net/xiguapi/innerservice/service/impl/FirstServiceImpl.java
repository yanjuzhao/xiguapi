package net.xiguapi.innerservice.service.impl;

import net.xiguapi.innerservice.dao.UserInfoDao;
import net.xiguapi.innerservice.model.UserInfo;
import net.xiguapi.innerservice.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfo(String name) {
        return userInfoDao.getUserInfo(name);
    }
}
