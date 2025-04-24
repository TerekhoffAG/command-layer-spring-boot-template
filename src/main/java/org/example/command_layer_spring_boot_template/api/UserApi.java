package org.example.command_layer_spring_boot_template.api;

import org.example.command_layer_spring_boot_template.api.dto.UserRequestDto;
import org.example.command_layer_spring_boot_template.api.dto.UserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/example")
public interface UserApi {

    @PostMapping
    ResponseEntity<UserResponseDto> create(@RequestBody UserRequestDto request);

}