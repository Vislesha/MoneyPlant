package com.rrekapalli.portfolioservice.controllers;

import com.rrekapalli.portfolioservice.dtos.PortfolioDto;
import com.rrekapalli.portfolioservice.dtos.PortfolioResponseDto;
import com.rrekapalli.portfolioservice.services.PortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/portfolio")
@RequiredArgsConstructor

public class PortfolioController {
    private final PortfolioService portfolioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PortfolioResponseDto createPortfolio(@RequestBody PortfolioDto portfolioToCreate){
        return portfolioService.createPortfolio(portfolioToCreate);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PortfolioResponseDto> getAllPortfolios(){
        return portfolioService.getAllPortfolios();
    }
}
