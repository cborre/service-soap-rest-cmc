package com.cmc.servicesoaprest.endpoint;

import com.cmc.service_soap.*;
import com.cmc.servicesoaprest.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PayloadRoot(namespace = "http://cmc.com/service-soap", localPart = "getAllUsersRequest")
    @ResponsePayload
    public GetAllUsersResponse getAllUsers(@RequestPayload GetAllUsersRequest request) {
        GetAllUsersResponse response = new GetAllUsersResponse();
        List<User> userList = userServiceImpl.getUsers();
        response.getUser().addAll(userList);
        return response;
    }
}