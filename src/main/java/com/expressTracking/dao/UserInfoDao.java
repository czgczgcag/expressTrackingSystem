package com.expressTracking.dao;

import com.expressTracking.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoDao {

    public int update(UserInfo userInfo);

    public int delete(int id);

    public void insert(UserInfo userInfo);

    public UserInfo get(int id);

    public UserInfo checkLogin(@Param("uId") int uId,@Param("password") String password);

}
