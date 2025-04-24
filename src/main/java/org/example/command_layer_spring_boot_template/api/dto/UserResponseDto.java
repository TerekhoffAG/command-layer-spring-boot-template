package org.example.command_layer_spring_boot_template.api.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public class UserResponseDto {
    private UUID userId;
}
