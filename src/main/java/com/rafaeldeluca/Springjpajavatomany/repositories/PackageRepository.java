package com.rafaeldeluca.Springjpajavatomany.repositories;

import com.rafaeldeluca.Springjpajavatomany.entities.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository <Package,Long> {

}
