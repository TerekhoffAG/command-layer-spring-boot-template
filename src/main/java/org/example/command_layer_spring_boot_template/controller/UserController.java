package org.example.command_layer_spring_boot_template.controller;

import org.example.command_layer_spring_boot_template.api.UserApi;
import org.example.command_layer_spring_boot_template.api.dto.UserRequestDto;
import org.example.command_layer_spring_boot_template.api.dto.UserResponseDto;
import org.example.command_layer_spring_boot_template.command.common.CommandSupport;
import org.example.command_layer_spring_boot_template.command.example.DoCreateUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController extends CommandSupport implements UserApi {

    @Override
    public ResponseEntity<UserResponseDto> create(UserRequestDto request) {

        UUID userId = execute(
                new DoCreateUser(
                        DoCreateUser.Payload.builder()
                                .name(request.getName())
                                .email(request.getEmail())
                                .build()
                )
        );

        return ResponseEntity.ok(
                UserResponseDto.builder()
                        .userId(userId)
                        .build()
        );
    }

}
