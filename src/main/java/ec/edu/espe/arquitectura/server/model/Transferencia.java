package ec.edu.espe.arquitectura.server.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "transferencia")
@TypeAlias("transferencia")
public class Transferencia {
    @Id 
    private String id;
    @Indexed(name = "idxu_cliente_codigoInterno", unique = true)
    private String codigoInterno;
    private Date fecha;
    private String cuentaOrigen;
    private String cuentaDestino;
    private Float valor;
    private String estado;
}
