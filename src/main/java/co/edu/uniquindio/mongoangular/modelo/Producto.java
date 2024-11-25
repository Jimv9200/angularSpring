package co.edu.uniquindio.mongoangular.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("productos")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Producto {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String nombre;
    private List<TipoProducto> tipoProducto;
    private int unidades;
    private float precio;
}
