package net.gongmingqm10.tutorial.service;

import net.gongmingqm10.tutorial.mappers.UserMapper;
import net.gongmingqm10.tutorial.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    protected UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public void create(User user) {
        userMapper.insert(user);
    }
}
