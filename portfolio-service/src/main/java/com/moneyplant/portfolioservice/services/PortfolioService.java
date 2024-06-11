package com.moneyplant.portfolioservice.services;

import com.moneyplant.portfolioservice.dtos.PortfolioDto;
import com.moneyplant.portfolioservice.dtos.PortfolioResponseDto;
import com.moneyplant.portfolioservice.entities.Portfolio;
import com.moneyplant.portfolioservice.repositories.PortfolioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PortfolioService {
    private final PortfolioRepository portfolioRepository;

    public PortfolioResponseDto createPortfolio(PortfolioDto PortfolioDto) {
        Portfolio newPortfolio = new Portfolio();

        newPortfolio.setName(PortfolioDto.getName());
        newPortfolio.setDescription(PortfolioDto.getDescription());

        portfolioRepository.save(newPortfolio);

        log.info("Portfolio created successfully!");

        // TODO:  Need mapper
        return new PortfolioResponseDto(
                newPortfolio.getId(),
                newPortfolio.getName(),
                newPortfolio.getDescription()
        );
    }

    // TODO:  Need mappers
    public List<PortfolioResponseDto> getAllPortfolios() {
        return portfolioRepository.findAll()
                .stream()
                .map(Portfolio -> new PortfolioResponseDto(
                        Portfolio.getId(),
                        Portfolio.getName(),
                        Portfolio.getDescription()
                ))
                .toList();
    }
}
