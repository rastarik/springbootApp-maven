package be.bruxelles.ictcg.springbootmaven.repository;

import be.bruxelles.ictcg.springbootmaven.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Long> {

     //All CRUD operations are implemented

     // named Query
     List<Product> findByCode(String code);

     Page<Product> findByCodeContains(String key, Pageable pageable);


     // HQL
    @Query("select p from Product p where p.code like :key and p.price > :min")
     List<Product> searchProduct(@Param("key") String key,
                                 @Param("min") double prixMin);
}
