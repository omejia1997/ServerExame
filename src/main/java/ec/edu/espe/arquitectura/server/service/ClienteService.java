package ec.edu.espe.arquitectura.server.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.server.dao.ClienteRepository;
import ec.edu.espe.arquitectura.server.model.Cliente;

@Service
public class ClienteService {
    
  private final ClienteRepository clienteRepository;

  public ClienteService(ClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }

  public Cliente createNarcotraficante(Cliente narcotraficantes) {
    this.clienteRepository.save(narcotraficantes);
    return narcotraficantes;
  }
}
