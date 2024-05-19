package com.rrekapalli.stockservice.services;

import com.rrekapalli.stockservice.dtos.StockDto;
import com.rrekapalli.stockservice.dtos.StockResponseDto;
import com.rrekapalli.stockservice.entities.Stock;
import com.rrekapalli.stockservice.repositories.StockRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockService {
    private final StockRepository stockRepository;

    public StockResponseDto createStock(StockDto stockDto) {
        Stock newStock = new Stock();

        newStock.setStockName(stockDto.getStockName());
        newStock.setStockSymbol(stockDto.getStockSymbol());

        stockRepository.save(newStock);

        log.info("Stock created successfully!");

        // TODO:  Need mapper
        return new StockResponseDto(
                newStock.getId(),
                newStock.getStockName(),
                newStock.getStockSymbol()
        );
    }

    // TODO:  Need mappers
    public List<StockResponseDto> getAllStocks() {
        return stockRepository.findAll()
                .stream()
                .map(stock -> new StockResponseDto(
                        stock.getId(),
                        stock.getStockName(),
                        stock.getStockSymbol()
                        ))
                .toList();
    }
}
