package com.example.duyshop.reponsitory;

import com.example.duyshop.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleReponsitory extends JpaRepository<RoleEntity,Integer> {
    
}
