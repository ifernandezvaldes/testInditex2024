package com.example.testinditex.repository;

import com.example.testinditex.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Price JPA Repository
 */
@Repository
public interface PricesRepository extends JpaRepository<Price, Integer> {

    @Query("SELECT p FROM Price p  WHERE p.startDate <= :date AND p.endDate >= :date AND p.brand.id = :brandId AND p.productId = :productId")
    List<Price> findByDate_brandId_cadenaId(@Param(value = "date") LocalDateTime date, @Param(value = "brandId") int brandId, @Param(value = "productId") int productId);
}
