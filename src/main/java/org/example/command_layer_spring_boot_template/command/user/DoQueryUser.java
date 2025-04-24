package org.example.command_layer_spring_boot_template.command.user;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.command_layer_spring_boot_template.command.common.Command;
import org.example.command_layer_spring_boot_template.dao.UserEntity;
import org.example.command_layer_spring_boot_template.dao.repository.UserRepository;

import java.util.List;

@RequiredArgsConstructor
public class DoQueryUser extends Command<List<UserEntity>> {

    private final Payload payload;

    @Override
    protected List<UserEntity> execute() {

        UserRepository repository = getContext().getUserRepository();

        return repository.findByNameAndEmail(payload.name, payload.email);
    }

    @Getter
    @Builder
    public static class Payload {
        private String name;
        private String email;
    }
}
