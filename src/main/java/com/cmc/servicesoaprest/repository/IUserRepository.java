package com.cmc.servicesoaprest.repository;

import com.cmc.servicesoaprest.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {

    @Query(value="Select * From users Limit 3", nativeQuery = true)
    public List<UserEntity> getUsers();
}