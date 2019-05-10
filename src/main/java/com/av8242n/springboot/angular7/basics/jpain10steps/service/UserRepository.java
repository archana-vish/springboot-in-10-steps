package com.av8242n.springboot.angular7.basics.jpain10steps.service;

import com.av8242n.springboot.angular7.basics.jpain10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User,Long> {
}
