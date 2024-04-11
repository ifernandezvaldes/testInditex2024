package com.example.testinditex.service;

import com.example.testinditex.dto.PriceResponseDTO;
import com.example.testinditex.entity.Price;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public interface PriceService {

    public List<PriceResponseDTO> getPriceByDate(Instant date, Integer brandId, Integer productId);
}
