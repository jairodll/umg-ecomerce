package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "categorias", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false)
    private Long idCategoria;

    @Column(name = "nombre_categoria", length = 50)
    private String nombreCategoria;

    @Column(name = "descripcion_categoria", length = 100)
    private String descripcionCategoria;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "usuario_adicion", length = 50)
    private String usuarioAdicion;

    @Column(name = "usuario_modifico", length = 50)
    private String usuarioModifico;
}
