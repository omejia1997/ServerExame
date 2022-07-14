package ec.edu.espe.arquitectura.server.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.server.service.TransferenciaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/transferencia")
@RequiredArgsConstructor
public class TransferenciaResource {
    private final TransferenciaService service;
    
    
}
