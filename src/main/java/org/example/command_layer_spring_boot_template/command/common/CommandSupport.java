package org.example.command_layer_spring_boot_template.command.common;

import org.example.command_layer_spring_boot_template.command.core.AbstractCommand;

public class CommandSupport {

    protected <T> T execute(AbstractCommand<T, CommandContext> command) {
        return command.execute(command);
    }

}
