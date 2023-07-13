package Api.rest.para.Voll.clinica.controller;

import Api.rest.para.Voll.clinica.medico.DatosRegistroMedico;
import Api.rest.para.Voll.clinica.medico.Medico;
import Api.rest.para.Voll.clinica.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void registrarMedico(@RequestBody @Valid  DatosRegistroMedico datosRegistroMedico){
        medicoRepository.save(new Medico(datosRegistroMedico));
    }


}
