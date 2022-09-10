package municipalidad;

public abstract class Propiedad {

    private String calle;
    private int numero;

    public Propiedad(){}

    public Propiedad(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public abstract Double calcularImpuesto();


    //Getters y Setters


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
