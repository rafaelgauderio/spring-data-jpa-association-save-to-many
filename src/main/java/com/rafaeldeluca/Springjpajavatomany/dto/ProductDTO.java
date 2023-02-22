package com.rafaeldeluca.Springjpajavatomany.dto;

import com.rafaeldeluca.Springjpajavatomany.entities.Product;
import com.rafaeldeluca.Springjpajavatomany.entities.Package;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

    private Long id;
    private String name;
    private Double price;

    private List<PackageDTO> packages = new ArrayList<PackageDTO>();

    public ProductDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
        for(Package pack : entity.getPackages()) {
            packages.add(new PackageDTO(pack));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public List<PackageDTO> getPackages() {
        return packages;
    }
}
