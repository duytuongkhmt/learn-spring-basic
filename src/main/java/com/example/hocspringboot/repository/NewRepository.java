package com.example.hocspringboot.repository;

import com.example.hocspringboot.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepository extends JpaRepository<NewEntity,Long> {

}
