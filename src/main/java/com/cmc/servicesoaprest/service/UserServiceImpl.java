package com.cmc.servicesoaprest.service;

import com.cmc.service_soap.User;
import com.cmc.servicesoaprest.models.UserEntity;
import com.cmc.servicesoaprest.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserRepository userRepository;

    @Override
    @Transactional(readOnly=true)
    public List<User> getUsers() {

        // GetUsers
        List<UserEntity> userEntities = userRepository.getUsers();

        // List users
        List<User> users = new ArrayList<>();

        for (UserEntity userEntity: userEntities) {

            // Instance user
            User user = new User();

            // Set fields
            user.setName(userEntity.getName());
            user.setCodeUser(userEntity.getCodeUser());
            user.setIntent(userEntity.getIntent());
            user.setPhone(userEntity.getPhone());
            user.setDateAuth(userEntity.getDateAuth());
            user.setHourAuth(userEntity.getHourAuth());
            user.setEmail(userEntity.getEmail());

            // Add user
            users.add(user);
        }

        // Return
        return users;
    }
}