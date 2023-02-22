package com.rafaeldeluca.Springjpajavatomany.services;


import com.rafaeldeluca.Springjpajavatomany.dto.PackageDTO;
import com.rafaeldeluca.Springjpajavatomany.dto.ProductDTO;
import com.rafaeldeluca.Springjpajavatomany.entities.Product;
import com.rafaeldeluca.Springjpajavatomany.entities.Package;
import com.rafaeldeluca.Springjpajavatomany.repositories.PackageRepository;
import com.rafaeldeluca.Springjpajavatomany.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private PackageRepository packageRepository;

    public ProductDTO insert(ProductDTO dto) {

        Product entity = new Product();
        //dto.setId(entity.getId()); jpa gera o id automativcamente
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());

        for (PackageDTO packDTO : dto.getPackages()) {
            //Package pack = new Package();
            //pack.setId(packDTO.getId());
            Package pack = packageRepository.getReferenceById(packDTO.getId());
            entity.getPackages().add(pack);
        }
        entity = productRepository.save(entity);
        return new ProductDTO(entity);

    }
}
