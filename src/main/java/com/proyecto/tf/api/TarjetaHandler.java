package com.proyecto.tf.api;

import com.proyecto.tf.entity.Tarjeta;
import com.proyecto.tf.services.ITarjetaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tarjetas")
@AllArgsConstructor
public class TarjetaHandler {

    private final ITarjetaService tarjetaService;

    @GetMapping({"/", ""})
    public ResponseEntity<List<Tarjeta>> get(){
        return ResponseEntity.ok().body(tarjetaService.get());
    }
}
