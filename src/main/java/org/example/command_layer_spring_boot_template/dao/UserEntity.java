package org.example.command_layer_spring_boot_template.dao;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Builder
@Entity
@Table(name = "cl_user")
public class UserEntity {
    /**
     * Unique identifier user.
     * Automatically generated using UUID.
     * Serves as the primary key in the database table.
     */
    @Id
    @Column(name = "id")
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private UUID id;

    /**
     * User name
     */
    @Column(name = "name")
    private String name;

    /**
     * User email address
     */
    @Column(name = "email")
    private String email;

}
