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

        ecHZangano zangano = new ecHZangano();
        ecAlimento uva = new ecAlimento();

        zangano.ecComer(uva);
    }

}
