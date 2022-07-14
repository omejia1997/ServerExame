package ec.edu.espe.arquitectura.server.mapper;

import ec.edu.espe.arquitectura.server.dto.ClienteDTO;
import ec.edu.espe.arquitectura.server.model.Cliente;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {
    public static Cliente buildCliente(ClienteDTO dto) {
    return Cliente.builder()
        .cedula(dto.getCedula())
        .nombreCompleto(dto.getNombreCompleto())
        .estado(dto.getEstado())
        .build();
  }

  public static ClienteDTO buildClienteDTO(Cliente cliente) {
    return ClienteDTO.builder()
        .nombreCompleto(cliente.getNombreCompleto())
        .estado(cliente.getEstado())
        .build();
  }
}
