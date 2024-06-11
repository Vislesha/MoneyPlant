package com.moneyplant.stockservice.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StockDto {
    private String stockName;
    private String stockSymbol;
}
