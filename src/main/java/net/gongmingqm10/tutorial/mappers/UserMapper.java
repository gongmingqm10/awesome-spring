package net.gongmingqm10.tutorial.mappers;

import net.gongmingqm10.tutorial.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> getAllUsers();
}
