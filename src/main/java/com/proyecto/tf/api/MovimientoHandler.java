package com.proyecto.tf.api;

import com.proyecto.tf.entity.Movimiento;
import com.proyecto.tf.services.IMovimientoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
@AllArgsConstructor
public class MovimientoHandler {

    private final IMovimientoService movimientoService;

    @GetMapping({"/", ""})
    public ResponseEntity<List<Movimiento>> get(){
        return ResponseEntity.ok().body(movimientoService.get());
    }
}
