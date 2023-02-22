package com.rafaeldeluca.Springjpajavatomany.dto;
import com.rafaeldeluca.Springjpajavatomany.entities.Package;

public class PackageDTO {

    private Long id;
    private String name;

    public PackageDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public PackageDTO(Package entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
