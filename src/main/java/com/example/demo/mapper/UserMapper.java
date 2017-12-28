package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by tianbenzhen on 2017/11/3.
 */
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    public User getUserById(@Param("id") long id);

}
