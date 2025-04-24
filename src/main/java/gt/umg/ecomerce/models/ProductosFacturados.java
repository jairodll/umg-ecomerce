package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "productos_facturados", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class ProductosFacturados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_factura", nullable = false)
    private Long idProductoFactura;

    @Column(name = "id_factura")
    private Long idFactura;

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
