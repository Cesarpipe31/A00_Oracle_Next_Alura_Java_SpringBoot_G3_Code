package Api.rest.para.Voll.clinica.domain.medico;

import Api.rest.para.Voll.clinica.domain.direccion.DatosDireccion;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
