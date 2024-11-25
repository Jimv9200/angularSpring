package co.edu.uniquindio.mongoangular.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("clientes")
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private List<String> telefono;
}
