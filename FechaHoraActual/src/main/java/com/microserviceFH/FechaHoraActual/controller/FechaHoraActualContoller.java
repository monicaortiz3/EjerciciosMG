package com.microserviceFH.FechaHoraActual.controller;

import com.microserviceFH.FechaHoraActual.Service.FechaHoraActualService;
import com.microserviceFH.FechaHoraActual.dto.FechaHoraDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/api/v1")
public class FechaHoraActualContoller {
    //http://localhost:8080/api/v1/fecha-hora-actual

    private final FechaHoraActualService fechaHoraActualService;

    public FechaHoraActualContoller(FechaHoraActualService fechaHoraActualService){
        this.fechaHoraActualService = fechaHoraActualService;
    }

    @GetMapping(path = "/fecha-hora-actual")
    public ResponseEntity<FechaHoraDto> fechaHoraDto(){
        FechaHoraDto fechaHoraDto = this.fechaHoraActualService.fechaHoraActual();

        return ResponseEntity.status(HttpStatus.OK)
                .body(fechaHoraDto);
    }

}
