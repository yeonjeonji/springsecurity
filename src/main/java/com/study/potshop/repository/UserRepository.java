package com.study.potshop.repository;

import com.study.potshop.entity.ProductEntity;
import com.study.potshop.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
