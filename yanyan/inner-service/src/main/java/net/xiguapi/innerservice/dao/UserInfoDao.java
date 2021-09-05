package net.xiguapi.innerservice.dao;

import net.xiguapi.innerservice.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {

    public UserInfo getUserInfo(String name);
}
