package base_datos.hotel.repositorio;

import base_datos.hotel.entidad.Habitacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepo extends CrudRepository <Habitacion, Long> {
}
