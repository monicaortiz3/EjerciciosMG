package com.microserviceFH.FechaHoraActual.Service;

import com.microserviceFH.FechaHoraActual.dto.FechaHoraDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Service
public class FechaHoraActualService {

    public FechaHoraDto fechaHoraActual(){

        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();

        return new FechaHoraDto(fecha,hora);
    }

}
