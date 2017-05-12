package com.database.entity;



import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/7.
 *
 * @NamedQuery(name = "User.findByName", query = "select * from user u where u.user_name=?1")
 */

@Entity(name = "user")
public class User implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "_id")
    Long id;
    @Column(name = "school_id")
    String schoolId;
    @Column(name = "user_name")
    String userName;
    @Column(name = "phone")
    String phone;
    @Column(name = "email")
    String email;
    @Column(name = "college")
    String college;
    @Column(name = "school")
    String school;
    @Column(name = "major")
    String major;
    @Column(name = "password")
    String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
