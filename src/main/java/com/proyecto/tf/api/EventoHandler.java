package com.proyecto.tf.api;

import com.proyecto.tf.entity.Evento;
import com.proyecto.tf.service.IEventoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
@AllArgsConstructor
public class EventoHandler {

    private final IEventoService eventoService;

    @GetMapping({"/", ""})
    public ResponseEntity<List<Evento>> get(){
        return ResponseEntity.ok().body(eventoService.get());
    }
}
