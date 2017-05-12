package com.database.service;

import com.database.entity.Book;
import com.database.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/4/22.
 */
public interface IUserService {

    public List<User> findAll();
    public User findBySchoolId(String schoolId);

    public List<Book> findAllBook();
    public void delete(String name);
    public void saveBook(Book book);

}
