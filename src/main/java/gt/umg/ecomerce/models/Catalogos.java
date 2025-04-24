package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "catalogos", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Catalogos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_catalogo", nullable = false)
    private Long codigoCatalogo;

    @Column(name = "nombre_catalogo", length = 50)
    private String nombreCatalogo;

    @Column(name = "descripcion_catalogo", length = 100)
    private String descripcionCatalogo;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "usuario_adicion", length = 50)
    private String usuarioAdicion;

    @Column(name = "usuario_modificacion", length = 50)
    private String usuarioModificacion;
}
