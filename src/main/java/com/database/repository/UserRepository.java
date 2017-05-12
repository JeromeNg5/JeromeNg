package com.database.repository;

import com.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/4/22.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    public User findBySchoolId(String schoolId);

}
