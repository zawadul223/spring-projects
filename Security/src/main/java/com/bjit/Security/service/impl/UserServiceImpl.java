package com.bjit.Security.service.impl;

import com.bjit.Security.model.UserResponseModel;
import com.bjit.Security.service.UserService;
import com.bjit.Security.entity.UserEntity;
import com.bjit.Security.model.UserRequestModel;
import com.bjit.Security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public ResponseEntity<Object> register(UserRequestModel requestModel) {
        UserEntity userEntity = UserEntity.builder()
                .email(requestModel.getEmail())
                .userName(requestModel.getUserName())
                .firstName(requestModel.getFirstName())
                .lastName(requestModel.getLastName())
                .password(requestModel.getPassword())
                .build();
        UserEntity savedUserEntity = userRepository.save(userEntity);

        UserResponseModel userResponseModel = new UserResponseModel();
        userResponseModel.setUserName(savedUserEntity.getUserName());
        userResponseModel.setEmail(savedUserEntity.getEmail());
        userResponseModel.setFirstName(savedUserEntity.getFirstName());
        userResponseModel.setLastName(savedUserEntity.getLastName());
        return new ResponseEntity<>(userResponseModel, HttpStatus.CREATED);
    }

//    @Override
//    public ResponseEntity<Object> response(UserResponseModel responseModel){
//        UserResponseModel userResponseModel = new UserResponseModel(
//                responseModel.getUserName(),
//                responseModel.getEmail(),
//                responseModel.getFirstName(),
//                responseModel.getLastName());
//
//        return new ResponseEntity<>(userResponseModel, HttpStatus.OK);
//    }
}