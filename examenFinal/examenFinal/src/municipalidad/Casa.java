package municipalidad;

public class Casa extends Propiedad {

    private int baseImpuesto;

    public Casa(){}

    public Casa(String calle, int numero, int baseImpuesto) {
        super(calle, numero);
        this.baseImpuesto = baseImpuesto;
    }

    @Override
    public Double calcularImpuesto() {
        return 0.;
    }

    public int getBaseImpuesto() {
        return baseImpuesto;
    }

    public void setBaseImpuesto(int baseImpuesto) {
        this.baseImpuesto = baseImpuesto;
    }



}
