package com.cdackolkata.demo.spring.service;

import java.util.List;

import com.cdackolkata.demo.spring.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
