package org.example.command_layer_spring_boot_template.dao.repository;

import org.example.command_layer_spring_boot_template.dao.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    List<UserEntity> findByNameAndEmail(String name, String email);

}