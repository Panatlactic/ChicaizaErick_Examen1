package ecArmamento;

public class ecBBA {

    public ecBBA (){
    }

    public boolean ecExplotar (boolean coordValida){
        if (coordValida){
            System.out.println("La bomba BBA ha acertado en uno de los blancos y lo ha destruido excitosamente");
            return true;
        } else {
            System.out.println("Tipo de armamento a destruir no localizado");
            return false;
        }
    }

}
