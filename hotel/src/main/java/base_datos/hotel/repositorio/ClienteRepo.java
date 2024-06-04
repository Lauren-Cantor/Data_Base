package base_datos.hotel.repositorio;

import base_datos.hotel.entidad.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends CrudRepository<Cliente, Long> {
}
