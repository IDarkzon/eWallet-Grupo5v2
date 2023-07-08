package com.proyecto.tf.api;

import com.proyecto.tf.entity.Evento;
import com.proyecto.tf.service.IEventoService;
import com.proyecto.tf.service.IUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
@AllArgsConstructor
public class EventoHandler {

    private final IEventoService eventoService;
    private final IUsuarioService usuarioService;

    @GetMapping({"/", ""})
    public ResponseEntity<List<Evento>> get(){
        return ResponseEntity.ok().body(eventoService.get());
    }

    @GetMapping("/{id}")
    public Evento getEvento(@PathVariable("id") Integer id) {
        return eventoService.getEvento(id);
    }

    @PostMapping("{id_usuario}/add")
    public void save(@PathVariable("id_usuario") Integer id, @RequestBody Evento evento){
        evento.setUsuario(usuarioService.getUsuario(id));

        eventoService.save(evento);
    }

    @PutMapping("{id_usuario}/update")
    public void update(@PathVariable("id_usuario") Integer id, @RequestBody Evento evento){
        evento.setUsuario(usuarioService.getUsuario(id));

        eventoService.save(evento);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        eventoService.delete(id);
    }
}
