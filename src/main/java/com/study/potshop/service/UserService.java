package com.study.potshop.service;

import com.study.potshop.dto.UsersDto;
import com.study.potshop.entity.UserEntity;
import com.study.potshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UsersDto create(UsersDto usersDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(usersDto.getUsername());
        userEntity.setEmail(usersDto.getEmail());
        userEntity.setEmail(usersDto.getPassword());
        userEntity.setPassword(passwordEncoder.encode(usersDto.getPassword()));
        System.out.println("encoding" + passwordEncoder.encode(usersDto.getPassword()));
        usersDto = UserEntity.toDto(userRepository.save(userEntity));
        return usersDto;
    }


}
