package service;

import dto.UserResponseDto;
import model.User;

public class UserMapper {
    public static UserResponseDto toDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setAge(user.getAge());
        return dto;
    }
}
