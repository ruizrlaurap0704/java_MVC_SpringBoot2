package municipalidad;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad{

    private double nFactor;
    private List<Propiedad> propiedades;

    public BarrioCerrado(){
        this.propiedades = new ArrayList<>();
    }

    @Override
    public Double calcularImpuesto() {
        return null;
    }

    public BarrioCerrado(int factor) {
        this.nFactor = factor;
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropíedad(Propiedad propiedad){
        this.propiedades.add(propiedad);
    }


    public double getnFactor() {
        return nFactor;
    }

    public void setFactor(int factor) {
        this.nFactor = factor;
    }



}
