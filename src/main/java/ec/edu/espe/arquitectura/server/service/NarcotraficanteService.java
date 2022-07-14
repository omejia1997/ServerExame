package ec.edu.espe.arquitectura.server.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.server.dao.NarcotraficantesRepository;
import ec.edu.espe.arquitectura.server.model.Narcotraficantes;

@Service
public class NarcotraficanteService {
    
  private final NarcotraficantesRepository narcotraficantesRepository;

   public NarcotraficanteService(NarcotraficantesRepository narcotraficantesRepository) {
    this.narcotraficantesRepository = narcotraficantesRepository;
  }

  public Narcotraficantes createNarcotraficante(Narcotraficantes narcotraficantes) {
    this.narcotraficantesRepository.save(narcotraficantes);
    return narcotraficantes;
  }
}
