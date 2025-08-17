package idat.pe.security_config_ef.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hola")
    public String saludando() {
        return "¡Hola, estás autenticado!";
    }


}
