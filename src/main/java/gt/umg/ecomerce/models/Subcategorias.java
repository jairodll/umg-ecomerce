package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "subcategorias", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Subcategorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subcategoria", nullable = false)
    private Long idSubcategoria;

    @Column(name = "id_categoria")
    private Long idCategoria;

    @Column(name = "nombre_subcategoria", length = 50)
    private String nombreSubcategoria;

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
