package com.example.testinditex.mapper;


import com.example.testinditex.dto.PriceResponseDTO;
import com.example.testinditex.entity.Price;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de mapeo
 */
public class PriceResponseMapper {

    /**
     * Metodo para el mapeo de la clase PRICE
     * @param List<Price> prices
     * @return List<PriceResponseDTO>
     */
    public static List<PriceResponseDTO> mapPriceResponseDTO(List<Price> prices) {
        List<PriceResponseDTO> list = new ArrayList<>();
        prices.stream().forEach(price -> {
            PriceResponseDTO priceResponseDTO = new PriceResponseDTO();
            String precioFinal = price.getPrice() + price.getCurr();
            priceResponseDTO.setPrecioFinal(precioFinal);
            priceResponseDTO.setPriceList(price.getPriceList().toString());
            priceResponseDTO.setBrandId(price.getBrand().getId().toString() + price.getBrand().getNameBrand());
            priceResponseDTO.setProductId(price.getProductId().toString());
            priceResponseDTO.setStartDate(price.getStartDate().toString());
            priceResponseDTO.setEndDate(price.getEndDate().toString());
            list.add(priceResponseDTO);
        });

        return list;
    }
}
