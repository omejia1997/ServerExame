package ec.edu.espe.arquitectura.server.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.server.model.Narcotraficantes;

public interface NarcotraficantesRepository extends MongoRepository<Narcotraficantes, String>{
    
}
