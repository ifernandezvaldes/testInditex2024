package com.example.testinditex.service.impl;

import com.example.testinditex.dto.PriceResponseDTO;
import com.example.testinditex.entity.Price;
import com.example.testinditex.mapper.PriceResponseMapper;
import com.example.testinditex.repository.PricesRepository;
import com.example.testinditex.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PricesRepository pricesRepository;

    @Override
    public List<PriceResponseDTO> getPriceByDate(Instant date, Integer brandId, Integer productId) {
        List<Price> prices = new ArrayList<>();
        prices = pricesRepository.findByDate_brandId_cadenaId(date, brandId, productId);
        PriceResponseMapper mapper = new PriceResponseMapper();
        return mapper.mapPriceResponseDTO(prices);
    }
}
