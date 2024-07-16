package com.study.potshop.entity;

import com.study.potshop.dto.UsersDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "siteuser")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;


    public static UsersDto toDto(UserEntity userEntity) {
        UsersDto usersDto = new UsersDto();
        usersDto.setUsername(userEntity.username);
        usersDto.setPassword(userEntity.password);
        usersDto.setEmail(userEntity.email);

        return usersDto;
    }
}
