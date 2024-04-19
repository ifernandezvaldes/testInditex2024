package com.example.testinditex.controller;

import com.example.testinditex.dto.PriceResponseDTO;
import com.example.testinditex.entity.Price;
import com.example.testinditex.service.PriceService;
import com.example.testinditex.service.impl.PriceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/price")
public class PriceController {

    @Autowired
    private PriceServiceImpl priceService;

    /**
     * Metodo que recupera Price en funcion de los campos fecha, id de producto e id de cadena
     * @param date
     * @param brandId
     * @param productId
     * @return ResponseEntity<PriceResponseDTO>
     */
    @GetMapping
    public ResponseEntity<PriceResponseDTO> getPrice(
            @RequestParam(value = "date") LocalDateTime date,
            @RequestParam(value = "brandId") Integer brandId,
            @RequestParam(value = "productId") Integer productId){
        PriceResponseDTO price = priceService.getPriceByDate(date, brandId, productId);
        return new ResponseEntity<>(price, HttpStatus.OK);
    }
}
