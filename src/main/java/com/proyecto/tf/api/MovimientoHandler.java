package com.proyecto.tf.api;

import com.proyecto.tf.entity.Movimiento;
import com.proyecto.tf.service.IMovimientoService;
import com.proyecto.tf.service.ITarjetaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
@AllArgsConstructor
public class MovimientoHandler {

    private final IMovimientoService movimientoService;
    private final ITarjetaService tarjetaService;

    @GetMapping({"/", ""})
    public ResponseEntity<List<Movimiento>> get(){
        return ResponseEntity.ok().body(movimientoService.get());
    }

    @GetMapping("/{id}")
    public Movimiento getMovimiento(@PathVariable("id") Integer id){
        return movimientoService.getMovimiento(id);
    }

    @PostMapping("{id_tarjeta}/add")
    public void save(@PathVariable("id_tarjeta") Integer id, @RequestBody Movimiento movimiento){
        movimiento.setTarjeta(tarjetaService.getTarjeta(id));

        movimientoService.save(movimiento);
    }

    @PutMapping("{id_tarjeta}/update")
    public void update(@PathVariable("id_tarjeta") Integer id, @RequestBody Movimiento movimiento){
        movimiento.setTarjeta(tarjetaService.getTarjeta(id));

        movimientoService.save(movimiento);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        movimientoService.delete(id);
    }
}
