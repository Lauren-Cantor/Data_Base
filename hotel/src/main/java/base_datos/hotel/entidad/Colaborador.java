package base_datos.hotel.entidad;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "Colaboradores")
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_colaborador;
    private String Nombre;
    private String Apellido;
    private String Rol;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    public Colaborador() {
    }

    public Long getId_colaborador() {
        return Id_colaborador;
    }

    public void setId_colaborador(Long id_colaborador) {
        Id_colaborador = id_colaborador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }
    @PrePersist
    protected void onCreate(){
        this.createdAt=new Date();
    }
}
