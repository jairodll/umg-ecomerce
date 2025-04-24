package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "facturas", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura", nullable = false)
    private Long idFactura;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "fecha_factura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;

    @Column(name = "total", precision = 18, scale = 2)
    private BigDecimal total;

    @Column(name = "estado_pago", length = 25)
    private String estadoPago;

    @Column(name = "metodo_pago", length = 25)
    private String metodoPago;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
}
