package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "productos_carro", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class ProductosCarro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_carro", nullable = false)
    private Long idProductoCarro;

    @Column(name = "id_carro")
    private Long idCarro;

    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_unitario", precision = 18, scale = 2)
    private BigDecimal precioUnitario;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
}
