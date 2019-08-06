package com.stepsbysteps.data.jpa;

import com.stepsbysteps.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPersistence extends JpaRepository<User, Long> {
    Boolean findByUserName(String userName);
}