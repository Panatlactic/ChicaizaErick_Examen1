package ecHormigas;

public class ecHZangano extends ecHormiga implements ecIHormiga{

    public ecHZangano (){
        ecOmnivoro omnivoro = new ecOmnivoro("Zanagno");
        System.out.println(omnivoro.ecToString());
    }

    public boolean ecComer (ecAlimento alimento){
        if (alimento.getNombre().equalsIgnoreCase("planta")){
            System.out.println("El zangano ha comido " + alimento.getNombre());
            return true;
        } else if (alimento.getNombre().equalsIgnoreCase("carne")){
            System.out.println("El zangano ha comido " + alimento.getNombre());
            return true;
        } else {
            System.out.println("La comida que le dio fue toxica. El zangano murió");
            return false;
        }

    }
}
