package org.example.command_layer_spring_boot_template.controller;

import org.example.command_layer_spring_boot_template.api.ExampleApi;
import org.example.command_layer_spring_boot_template.api.dto.ExampleRequestDto;
import org.example.command_layer_spring_boot_template.api.dto.ExampleResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController implements ExampleApi {

    @Override
    public ResponseEntity<ExampleResponseDto> create(ExampleRequestDto request) {
        return null;
    }

}
