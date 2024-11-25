package co.edu.uniquindio.mongoangular.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;


@AllArgsConstructor
@Getter
@Setter
public class DetalleProducto {

    private ObjectId idProducto;
    private float precio;
    private int cantidad;


}
