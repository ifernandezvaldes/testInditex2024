package com.example.testinditex;


import com.example.testinditex.controller.PriceController;
import com.example.testinditex.dto.PriceResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class PriceTest {

    @Autowired
    PriceController priceController;


    @Test
    public void test1() {
        // Datos de prueba
        LocalDateTime date = LocalDateTime.parse("2020-06-14T10:00:00");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<PriceResponseDTO> response = priceController.getPrice(date, brandId, productId);

        //Asserts
        assertEquals(HttpStatus.OK, response.getStatusCode());
        //Comprobamos que el precio es el correspondiente al perdiodo de tiempo
        assertEquals(response.getBody().getPrecioFinal(), "35.50 EUR");
    }

    @Test
    public void test2() {
        // Datos de prueba
        LocalDateTime date = LocalDateTime.parse("2020-06-14T16:00:00");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<PriceResponseDTO> response = priceController.getPrice(date, brandId, productId);

        //Asserts
        assertEquals(HttpStatus.OK, response.getStatusCode());
        //Comprobamos que el precio es el correspondiente al perdiodo de tiempo + priority
        assertEquals(response.getBody().getPrecioFinal(), "25.45 EUR");
    }

    @Test
    public void test3() {
        // Datos de prueba
        LocalDateTime date = LocalDateTime.parse("2020-06-14T21:00:00");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<PriceResponseDTO> response = priceController.getPrice(date, brandId, productId);

        //Asserts
        assertEquals(HttpStatus.OK, response.getStatusCode());
        //Comprobamos que el precio es el correspondiente al perdiodo de tiempo
        assertEquals(response.getBody().getPrecioFinal(), "35.50 EUR");
    }

    @Test
    public void test4() {
        // Datos de prueba
        LocalDateTime date = LocalDateTime.parse("2020-06-15T10:00:00");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<PriceResponseDTO> response = priceController.getPrice(date, brandId, productId);

        //Asserts
        assertEquals(HttpStatus.OK, response.getStatusCode());
        //Comprobamos que el precio es el correspondiente al perdiodo de tiempo
        assertEquals(response.getBody().getPrecioFinal(), "30.50 EUR");
    }

    @Test
    public void test5() {
        // Datos de prueba
        LocalDateTime date = LocalDateTime.parse("2020-06-16T21:00:00");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<PriceResponseDTO> response = priceController.getPrice(date, brandId, productId);

        //Asserts
        assertEquals(HttpStatus.OK, response.getStatusCode());
        //Comprobamos que el precio es el correspondiente al perdiodo de tiempo
        assertEquals(response.getBody().getPrecioFinal(), "38.95 EUR");
    }



}
