package org.example.command_layer_spring_boot_template.command.common;

import org.example.command_layer_spring_boot_template.command.core.AbstractCommand;

/**
 * Command with common context
 *
 * @param <T> type of executable command
 */
public abstract class Command<T> extends AbstractCommand<T, CommandContext> {
}
