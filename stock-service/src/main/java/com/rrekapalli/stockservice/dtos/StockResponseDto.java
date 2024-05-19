package com.rrekapalli.stockservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StockResponseDto {
    private String id;
    private String stockName;
    private String stockSymbol;
}
