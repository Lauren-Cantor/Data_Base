package base_datos.hotel.repositorio;

import base_datos.hotel.entidad.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepo extends CrudRepository <Reserva, Long> {
}
