package com.controller;

import com.database.entity.Book;
import com.database.entity.User;
import com.database.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Carl on 2017/4/6.
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * https://www.baidu.com/zoos
     *  value = "/users/{username}" 代表访问的URL是"http://host:PORT/users/实际的用户名"
     *
     * @param username
     * @param pwd
     * @return
     *
     */
//    @RequestMapping(value = "/{username}",method = RequestMethod.GET,consumes = "application/json")
//    public User getUser(@PathVariable String username, @RequestParam String pwd){
//        if (username.equals("陈其康")){
//            User user = new User();
//            return user;
//        }
//        return null;
//    }

    @RequestMapping(value = "/allusers",method = RequestMethod.GET,consumes = "application/json")
    public List<User> getAllUsers(){

        return userService.findAll();
    }
    @RequestMapping(value = "/user/{schoolid}",method = RequestMethod.GET,consumes = "application/json")
    public User getBySchoolId(@PathVariable String schoolid){
        return userService.findBySchoolId(schoolid);
    }

    //查找所有的书
    @RequestMapping(value = "/books",method = RequestMethod.GET)
    public List<Book> getAllBooks(){

        return userService.findAllBook();
    }

    //按书名删除书
    @RequestMapping(value = "/delete/{name}",method = RequestMethod.GET)
    public void deleteBook(@PathVariable String name)
    {
        userService.delete(name);
    }

    //添加一本书
    @RequestMapping(value="/add/{name}/{id}/{writer}/{price}")
    public Book addBook(@PathVariable String name,@PathVariable String id,@PathVariable String writer,@PathVariable float price)
    {
        Book book=new Book();
        book.setName(name);
        book.setId(id);
        book.setWriter(writer);
        book.setPrice(price);
        userService.saveBook(book);
        return book;
    }

}