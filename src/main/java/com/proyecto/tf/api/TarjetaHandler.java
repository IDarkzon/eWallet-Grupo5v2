package com.proyecto.tf.api;

import com.proyecto.tf.entity.Tarjeta;
import com.proyecto.tf.service.ITarjetaService;
import com.proyecto.tf.service.IUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarjetas")
@AllArgsConstructor
public class TarjetaHandler {

    private final ITarjetaService tarjetaService;
    private final IUsuarioService usuarioService;

    @GetMapping({"/", ""})
    public ResponseEntity<List<Tarjeta>> get(){
        return ResponseEntity.ok().body(tarjetaService.get());
    }

    @GetMapping("/{id}")
    public Tarjeta getTarjeta(@PathVariable("id") Integer id){
        return tarjetaService.getTarjeta(id);
    }

    @PostMapping("{id_usuario}/add")
    public void save(@PathVariable("id_usuario") Integer id, @RequestBody Tarjeta tarjeta){
        tarjeta.setUsuario(usuarioService.getUsuario(id));

        tarjetaService.save(tarjeta);
    }

    @PutMapping("{id_usuario}/update")
    public void update(@PathVariable("id_usuario") Integer id, @RequestBody Tarjeta tarjeta){
        tarjeta.setUsuario(usuarioService.getUsuario(id));

        tarjetaService.save(tarjeta);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        tarjetaService.delete(id);
    }
}
