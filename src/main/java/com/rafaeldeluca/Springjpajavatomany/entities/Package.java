package com.rafaeldeluca.Springjpajavatomany.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_package")
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ind;
    private String name;

    @ManyToMany(mappedBy = "packages")
    private Set<Product> products = new HashSet<Product>();

    public Package () {

    }

    public Package(Long ind, String name) {
        this.ind = ind;
        this.name = name;
    }

    public Long getInd() {
        return ind;
    }

    public void setInd(Long ind) {
        this.ind = ind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    /*
    public void setProducts(Set<Product> products) {
        this.products = products;
    }
    */
}
