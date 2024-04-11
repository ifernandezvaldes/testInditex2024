package com.example.testinditex;

import com.example.testinditex.controller.PriceController;
import com.example.testinditex.dto.PriceResponseDTO;
import com.example.testinditex.repository.PricesRepository;
import com.example.testinditex.service.PriceService;
import com.example.testinditex.service.impl.PriceServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.ReflectionTestUtils;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestPropertySource(locations = "classpath:application.properties")
public class PriceTest {
    @InjectMocks
    private PriceController priceController;

    @Mock
    private PricesRepository    pricesRepository;

    @Mock
    private PriceService priceService;

    @BeforeEach
    public void init() {
        priceService = Mockito.mock(PriceServiceImpl.class);
        pricesRepository = Mockito.mock(PricesRepository.class);
        priceController = new PriceController();

    ReflectionTestUtils.setField(priceController, "priceService", priceService);
    ReflectionTestUtils.setField(priceService, "pricesRepository", pricesRepository);
    }

    @Test
    public void testGetPrice_Success1() {
        // Datos de prueba
        Instant date = Instant.parse("2020-06-14T10:00:00Z");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<List<PriceResponseDTO>> response = priceController.getPrice(date, brandId, productId);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void testGetPrice_Success2() {
        // Datos de prueba
        Instant date = Instant.parse("2020-06-14T16:00:00Z");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<List<PriceResponseDTO>> response = priceController.getPrice(date, brandId, productId);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void testGetPrice_Success3() {
        // Datos de prueba
        Instant date = Instant.parse("2020-06-14T21:00:00Z");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<List<PriceResponseDTO>> response = priceController.getPrice(date, brandId, productId);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void testGetPrice_Success4() {
        // Datos de prueba
        Instant date = Instant.parse("2020-06-15T10:00:00Z");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<List<PriceResponseDTO>> response = priceController.getPrice(date, brandId, productId);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void testGetPrice_Success5() {
        // Datos de prueba
        Instant date = Instant.parse("2020-06-16T21:00:00Z");
        Integer brandId = 1;
        Integer productId = 35455;

        // Prueba
        ResponseEntity<List<PriceResponseDTO>> response = priceController.getPrice(date, brandId, productId);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}
