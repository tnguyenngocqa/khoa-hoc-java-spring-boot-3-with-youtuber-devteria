package com.devteria.identityservice.mapper;

import com.devteria.identityservice.dto.request.request.UserCreationRequest;
import com.devteria.identityservice.dto.request.request.UserUpdateRequest;
import com.devteria.identityservice.dto.request.response.UserResponse;
import com.devteria.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
