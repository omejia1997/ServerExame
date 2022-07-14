package ec.edu.espe.arquitectura.server.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.server.model.Narcotraficantes;
import ec.edu.espe.arquitectura.server.service.NarcotraficanteService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/narcotraficante")
@RequiredArgsConstructor
public class NarcotraficanteResource {
    private final NarcotraficanteService service;
    
   @PostMapping
    public ResponseEntity<Narcotraficantes> create(@RequestBody Narcotraficantes narcotraficante) {
        try {
        Narcotraficantes narcotraficantedb =this.service.createNarcotraficante(narcotraficante);
        return ResponseEntity.ok(narcotraficantedb);
        } catch (Exception e) {
        e.printStackTrace();
        return ResponseEntity.badRequest().build();
        }
    } 
}
