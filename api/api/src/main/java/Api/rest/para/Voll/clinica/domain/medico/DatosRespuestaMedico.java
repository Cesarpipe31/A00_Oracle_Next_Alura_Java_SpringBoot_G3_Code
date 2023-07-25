package Api.rest.para.Voll.clinica.domain.medico;

import Api.rest.para.Voll.clinica.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String telefono, String dcoumento, DatosDireccion direccion) {
}
