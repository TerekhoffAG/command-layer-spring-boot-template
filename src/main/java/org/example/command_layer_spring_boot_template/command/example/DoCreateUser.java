package org.example.command_layer_spring_boot_template.command.example;

import lombok.*;
import org.example.command_layer_spring_boot_template.command.common.Command;
import org.example.command_layer_spring_boot_template.dao.UserEntity;
import org.example.command_layer_spring_boot_template.dao.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class DoCreateUser extends Command<UUID> {

    private final Payload payload;

    @Override
    protected UUID execute() {

        List<UserEntity> users = execute(
                new DoQueryUser(
                        DoQueryUser.Payload.builder()
                                .name(payload.getName())
                                .email(payload.getEmail())
                                .build()
                )
        );

        if(!users.isEmpty()) {
            throw new RuntimeException("User already exist.");
        }

        UserRepository repository = getContext().getUserRepository();

        UserEntity user = repository.save(
                UserEntity.builder()
                        .name(payload.getName())
                        .email(payload.getName())
                        .build()
        );

        return user.getId();
    }

    @Getter
    @Builder
    public static class Payload {
        private String name;
        private String email;
    }
}
