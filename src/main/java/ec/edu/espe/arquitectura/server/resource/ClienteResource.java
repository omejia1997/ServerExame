package ec.edu.espe.arquitectura.server.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.server.model.Cliente;
import ec.edu.espe.arquitectura.server.service.ClienteService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/cliente")
@RequiredArgsConstructor
public class ClienteResource {
    private final ClienteService service;

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        try {
        Cliente clientedb=this.service.createNarcotraficante(cliente);
        return ResponseEntity.ok(clientedb);
        } catch (Exception e) {
        e.printStackTrace();
        return ResponseEntity.badRequest().build();
        }
    } 
}
