package ec.edu.espe.arquitectura.server.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.server.model.Cliente;

public interface  ClienteRepository extends MongoRepository<Cliente, String>{
    Optional<Cliente> findByCedula(String codigoInterno, String estado);
}
