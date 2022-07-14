package ec.edu.espe.arquitectura.server.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "cliente")
@TypeAlias("cliente")
public class Cliente{
    @Id 
    private String id;
    @Indexed(name = "idxu_cliente_cedula", unique = true)
    private String cedula;
    private String nombreCompleto;
    private String estado;
}