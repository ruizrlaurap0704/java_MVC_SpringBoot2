package municipalidad;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private String nombre;
    private List<Propiedad> propiedades = new ArrayList<>();

    public void agregar(Propiedad propiedad){
        this.propiedades.add(propiedad);
    }

    public String generarInforme() {
        return "Municipio{" +
                "nombre='" + nombre + '\'' +
                ", propiedades=" + propiedades +
                '}';
    }
}
