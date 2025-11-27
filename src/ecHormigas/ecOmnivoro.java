package ecHormigas;

public class ecOmnivoro extends ecAlimento{

    public ecOmnivoro (String nombre){
        super(nombre);
        setNombre("Zangano");
    }

    public String ecToString (){
        return "Soy una hormiga Zangano y soy Omnivoro";
    }
}
