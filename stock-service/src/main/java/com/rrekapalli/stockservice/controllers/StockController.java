package com.rrekapalli.stockservice.controllers;

import com.rrekapalli.stockservice.dtos.StockDto;
import com.rrekapalli.stockservice.dtos.StockResponseDto;
import com.rrekapalli.stockservice.entities.Stock;
import com.rrekapalli.stockservice.services.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StockResponseDto createStock(@RequestBody StockDto stockToCreate){
        return stockService.createStock(stockToCreate);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StockResponseDto> getAllStocks(){
        return stockService.getAllStocks();
    }

}
