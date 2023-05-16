package com.bjit.Security.service;

import com.bjit.Security.model.UserRequestModel;
import com.bjit.Security.model.UserResponseModel;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<Object> register(UserRequestModel requestModel);
   // ResponseEntity<Object> response(UserResponseModel responseModel);
}
