package com.rrekapalli.portfolioservice.repositories;

import com.rrekapalli.portfolioservice.entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, String> {
}
