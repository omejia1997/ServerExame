package ec.edu.espe.arquitectura.server.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "narcotraficantes")
@TypeAlias("narcotraficantes")
public class Narcotraficantes{
    @Id 
    private String id;
    private String nombreCompleto;
    private String sancionado;
}