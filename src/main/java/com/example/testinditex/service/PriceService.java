package com.example.testinditex.service;

import com.example.testinditex.dto.PriceResponseDTO;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;


@Service
public interface PriceService {

    public PriceResponseDTO getPriceByDate(LocalDateTime date, Integer brandId, Integer productId);
}
