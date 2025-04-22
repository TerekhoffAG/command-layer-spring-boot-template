package org.example.command_layer_spring_boot_template.api;

import org.example.command_layer_spring_boot_template.api.dto.ExampleRequestDto;
import org.example.command_layer_spring_boot_template.api.dto.ExampleResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/example")
public interface ExampleApi {

    @PostMapping
    ResponseEntity<ExampleResponseDto> create(@RequestBody ExampleRequestDto request);

}