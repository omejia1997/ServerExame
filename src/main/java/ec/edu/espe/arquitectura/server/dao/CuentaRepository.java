package ec.edu.espe.arquitectura.server.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.server.model.Cuenta;

public interface CuentaRepository extends MongoRepository<Cuenta, String> {
    Optional<Cuenta> findByCodigoInterno(String codigoInterno, String estado);
}
