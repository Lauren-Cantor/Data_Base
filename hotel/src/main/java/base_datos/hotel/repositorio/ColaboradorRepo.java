package base_datos.hotel.repositorio;

import base_datos.hotel.entidad.Colaborador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepo extends CrudRepository <Colaborador, Long> {
}
