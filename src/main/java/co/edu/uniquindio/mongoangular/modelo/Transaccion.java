package co.edu.uniquindio.mongoangular.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.List;
import org.bson.types.ObjectId;


@Document("transacciones")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Transaccion {


    @Id
    @EqualsAndHashCode.Include
    private String codigo;


    private List<ObjectId> productos;
    private ObjectId idCliente;
    private LocalDateTime fecha;
    private Pago pago;


}
