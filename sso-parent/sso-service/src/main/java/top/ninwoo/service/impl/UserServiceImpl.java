package top.ninwoo.service.impl;

import top.ninwoo.common.pojo.User;
import top.ninwoo.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private static Map<String, String> userFiles = new HashMap<>();
    static {
        userFiles.put("joliu", "123456");
    }
    @Override
    public User getUser(String name, String password) {
        User user = null;
        if(userFiles.get(name) != null && userFiles.get(name).equals(password)) {
            user = new User();
            user.setAge(10);
            user.setId(1);
            user.setPassword("xxxx");
        }
        return user;
    }
}
