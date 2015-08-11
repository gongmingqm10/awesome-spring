package net.gongmingqm10.tutorial.mappers;

import net.gongmingqm10.tutorial.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> getAllUsers();

    @Insert(
            "INSERT INTO users (username, city, avatar, email, telephone) " +
                    " VALUES ( #{username}, #{city}, #{avatar}, #{email}, #{telephone})"
    )
    void insert(User user);
}
