package com.cdackolkata.demo.spring.dao;

import java.util.List;

import com.cdackolkata.demo.spring.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
