package org.example.command_layer_spring_boot_template.command.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.command_layer_spring_boot_template.dao.repository.UserRepository;
import org.springframework.stereotype.Component;

/**
 * Context of executable commands.
 */
@Getter
@Component
@RequiredArgsConstructor
public class CommandContext {

    private final UserRepository userRepository;

}
