import ecArmamento.ecBBA;
import ecHormigas.ecAlimento;
import ecHormigas.ecAntCiberDron;
import ecHormigas.ecHZangano;

public class ecAppSistema {

    public void ecSimular (){

        System.out.println();
        ecInformacion informacion = new ecInformacion();
        informacion.ecMostrarInformación();

        ecAntCiberDron ciberDron = new ecAntCiberDron();
        ecBBA bomba = new ecBBA();
        bomba.ecExplotar(ciberDron.ecBuscar("c"));

        System.out.println();
        ecHZangano zangano = new ecHZangano();
        // alimento creado para que coma el zangano. Solo puede comer "Planta" y  "Carne" porque es omnivoro
        ecAlimento alimento = new ecAlimento("carne");

        zangano.ecComer(alimento);
    }

}
