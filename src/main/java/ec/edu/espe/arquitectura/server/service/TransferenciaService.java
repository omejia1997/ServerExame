package ec.edu.espe.arquitectura.server.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.server.dao.ClienteRepository;
import ec.edu.espe.arquitectura.server.dao.CuentaRepository;
import ec.edu.espe.arquitectura.server.dao.TransferenciaRepository;
import ec.edu.espe.arquitectura.server.model.Transferencia;

@Service
public class TransferenciaService {
    private final TransferenciaRepository transferenciaRepository;
    private final CuentaRepository cuentaRepository;
    private final ClienteRepository clienteRepository;

    

    public TransferenciaService(TransferenciaRepository transferenciaRepository, CuentaRepository cuentaRepository,
            ClienteRepository clienteRepository) {
        this.transferenciaRepository = transferenciaRepository;
        this.cuentaRepository = cuentaRepository;
        this.clienteRepository = clienteRepository;
    }

    public void transferir(Transferencia transferencia){

    }

    private String obtenerNombreDestinatario(String cuentaDestino){
        
        return "";
    }
    

}
