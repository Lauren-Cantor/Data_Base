package base_datos.hotel.servicio;

import base_datos.hotel.repositorio.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {
    @Autowired
    private ClienteRepo repo;

}
