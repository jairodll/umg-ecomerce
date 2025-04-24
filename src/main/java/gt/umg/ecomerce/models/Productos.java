package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "productos", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Long idProducto;

    @Column(name = "nombre_producto", length = 100)
    private String nombreProducto;

    @Column(name = "descripcion_producto", length = 255)
    private String descripcionProducto;

    @Column(name = "precio", precision = 18, scale = 2)
    private BigDecimal precio;

    @Column(name = "id_subcategoria")
    private Long idSubcategoria;

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

    @Column(name = "codigo_catalogo")
    private Long codigoCatalogo;
}
