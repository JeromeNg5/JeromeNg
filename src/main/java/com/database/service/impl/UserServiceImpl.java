package com.database.service.impl;

import com.database.entity.Book;
import com.database.entity.User;
import com.database.repository.BookRespository;
import com.database.repository.UserRepository;
import com.database.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2017/4/22.
 */

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRespository bookRespository;

    @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }

    @Override
    public User findBySchoolId(String schoolId) {
        if (schoolId.equals("")){
            return null;
        }
        return userRepository.findBySchoolId(schoolId);
    }

    @Override
    public List<Book> findAllBook() {
        return bookRespository.findAll();
    }

    @Override
    public void delete(String name) {
        bookRespository.delete(name);
    }

    @Override
    public void saveBook(Book book) {
        bookRespository.save(book);
    }
}
