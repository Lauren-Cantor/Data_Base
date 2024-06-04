package base_datos.hotel.controlador;

import base_datos.hotel.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteControlador {
    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/")
    public String index() {
        return "index.jsp";
    }

}
