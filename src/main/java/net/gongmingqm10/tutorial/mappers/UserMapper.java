package net.gongmingqm10.tutorial.mappers;

import net.gongmingqm10.tutorial.model.User;
import org.apache.ibatis.annotations.Delete;
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

    @Delete("DELETE FROM users WHERE id=#{userId}")
    void delete(int userId);

    @Select("SELECT * FROM users WHERE id=#{userid}")
    User getUserById(int userId);
}
