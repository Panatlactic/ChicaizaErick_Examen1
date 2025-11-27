package ecHormigas;

public class ecHZangano extends ecHormiga implements ecIHormiga{
    public ecHZangano (){
        ecOmnivoro omnivoro = new ecOmnivoro();
        System.out.println(omnivoro.ecToString());
    }

    public boolean ecComer (ecAlimento alimento){
        System.out.println("El zangano ha comido");
        return true;
    }
}
