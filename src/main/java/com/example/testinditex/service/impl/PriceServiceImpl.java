package com.example.testinditex.service.impl;

import com.example.testinditex.dto.PriceResponseDTO;
import com.example.testinditex.entity.Price;
import com.example.testinditex.mapper.PriceResponseMapper;
import com.example.testinditex.repository.PricesRepository;
import com.example.testinditex.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PricesRepository pricesRepository;

    @Override
    public PriceResponseDTO getPriceByDate(LocalDateTime date, Integer brandId, Integer productId) {
        List<Price> prices = new ArrayList<>();
        //Lista de tarifas para ese rango de fechas
        prices = pricesRepository.findByDate_brandId_cadenaId(date, brandId, productId);
        //desambiguacion de tarifas
        Price price = desambiguarTarifa(prices);
        PriceResponseMapper mapper = new PriceResponseMapper();
        return mapper.mapPriceResponseDTO(price);
    }

    /**
     * Método para la desambiguacion de tarifas en mismo rango de fechas
     * @param prices
     * @return Price
     */
    private Price desambiguarTarifa(List<Price> prices) {
        return prices.stream().max(Comparator.comparingInt(Price::getPriority))
                .orElse(null);
    }
}
