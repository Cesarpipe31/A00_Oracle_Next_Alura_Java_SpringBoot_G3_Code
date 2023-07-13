package Api.rest.para.Voll.clinica.medico;

import Api.rest.para.Voll.clinica.direccion.DatosDireccion;
import Api.rest.para.Voll.clinica.direccion.Direccion;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
