package municipalidad;

public class PropiedadFactory {

    private static PropiedadFactory instance;
    public static final String casa = "CASA";
    public static final String barrioCerrado ="BARRIO_CERRADO";

    public static PropiedadFactory getInstance(){
        if(instance == null ){
            instance =new PropiedadFactory();
        }
        return instance;
    }

    //Factory Method
    public Propiedad crearPropiedad(String cod){
        switch(cod){
            case PropiedadFactory.casa:
                return new Casa();
            case PropiedadFactory.barrioCerrado:
                return new BarrioCerrado();
        }
        return null;
    }

}
