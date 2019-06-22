package top.ninwoo.service;

import top.ninwoo.common.pojo.User;

public interface UserService {
    User getUser(String name, String password);
}
