package com.example.testinditex.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * DTO para la respuesta
 */
public class PriceResponseDTO {

    private String precioFinal;
    private String productId;
    private String brandId;
    private String priceList;
    private String startDate;
    private String endDate;
}
