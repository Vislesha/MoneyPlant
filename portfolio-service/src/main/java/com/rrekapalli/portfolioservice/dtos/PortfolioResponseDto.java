package com.rrekapalli.portfolioservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PortfolioResponseDto {
    private String id;
    private String name;
    private String description;
}
