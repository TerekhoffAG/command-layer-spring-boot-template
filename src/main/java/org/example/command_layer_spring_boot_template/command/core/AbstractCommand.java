package org.example.command_layer_spring_boot_template.command.core;

/**
 * Abstract command
 *
 * @param <T> return type of executable command
 * @param <C> type context of executable command
 */
public abstract class AbstractCommand<T, C> {

    private C context;

    public <R> R execute(AbstractCommand<R, C> command) {
        this.context = command.getContext();

        return command.execute();
    }

    protected C getContext() {
        return this.context;
    }

    protected abstract T execute();
}
