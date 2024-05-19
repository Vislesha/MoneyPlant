package com.rrekapalli.stockservice.repositories;

import com.rrekapalli.stockservice.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, String> {

}
