package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Usuario", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Usuario", length = 50)
    private String usuario;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellido", length = 50)
    private String apellido;

    @Column(name = "contraseña", length = 50)
    private String contrasena;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "rol")
    private Long rol;

    @Column(name = "estatus")
    private Boolean estatus;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "usuario_creo", length = 50)
    private String usuarioCreo;

    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "usuario_modifico", length = 50)
    private String usuarioModifico;
}
