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
@Document(collection = "cuenta")
@TypeAlias("cuenta")
public class Cuenta {
    @Id 
    private String id;
    @Indexed(name = "idx_cuenta_idCliente", unique = false)
    private String idCliente;
    private String codigoInterno;
    private String saldo;
    private Date fechaUltMovimiento;
    private String estado;
}
