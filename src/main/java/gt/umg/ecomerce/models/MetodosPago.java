package gt.umg.ecomerce.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "metodos_pago", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class MetodosPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago", nullable = false)
    private Long idPago;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "tipo_tarjeta", length = 25)
    private String tipoTarjeta;

    @Column(name = "numero_tarjeta", length = 100)
    private String numeroTarjeta;

    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;

    @Column(name = "nombre_titular", length = 50)
    private String nombreTitular;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
}
