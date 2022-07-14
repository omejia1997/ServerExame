package ec.edu.espe.arquitectura.server.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.server.model.Transferencia;

public interface TransferenciaRepository extends MongoRepository<Transferencia, String>{
    Optional <Transferencia> findByCodigoInternoAndEstado(String codigoInterno, String estado);
}
