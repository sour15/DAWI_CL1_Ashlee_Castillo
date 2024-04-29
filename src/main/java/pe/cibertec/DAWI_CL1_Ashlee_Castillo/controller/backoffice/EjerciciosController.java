package pe.cibertec.DAWI_CL1_Ashlee_Castillo.controller.backoffice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjerciciosController {

    @GetMapping("/ejercicio1")
    public String ejercicio1(Model model) {
        return "backoffice/ejercicio 1/ejercio1";
    }
}
