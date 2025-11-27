package ecHormigas;

import ecArmamento.ecIIA;

public class ecAntCiberDron implements ecIIA{
    public ecAntCiberDron(){
    }

    public boolean ecBuscar (String tipoArsenal){
        boolean ecHuboDetoUno = true;
        boolean ecHuboDetoDos = true;

        System.out.println(". . .\nCOORDENADAS UCRANIANAS A DESTRUIR:\nGeoposición | Tipo Arsenal | Acción");

        int ecEstado = 0;

        for (char c : tipoArsenal.toCharArray()) {
            switch (ecEstado) {
                case 0:
                    if (c == 'a') ecEstado = 1;
                    else ecHuboDetoUno = false;
                break;

                case 1:
                    if (c == 'b') ecEstado = 2;
                    else ecHuboDetoUno = false;
                break;

                case 2:
                    if (c == 'b') ecEstado = 2;
                    else ecHuboDetoUno = false;
                break;
            }
        }


        if ((ecEstado == 1) || (ecEstado == 2) && ecHuboDetoUno == true){
            System.out.println("Coord-09    |     abbb     |  " + ecHuboDetoUno);
        } else {
            System.out.println("Coord-09    |     abbb     |  " + ecHuboDetoUno);
        }

        ecEstado = 0;
        for (char c : tipoArsenal.toCharArray()) {
            switch (ecEstado) {
                case 0:
                    if (c == 'a') ecEstado = 1;
                    else ecHuboDetoDos = false;
                break;

                case 1:
                    if (c == 'b') ecEstado = 2;
                    else ecHuboDetoDos = false;
                break;

                case 2:
                    if (c == 'c') ecEstado = 3;
                    else ecHuboDetoDos = false;
                break;

                case 3:
                    if (c == 'd') ecEstado = 4;
                    else ecHuboDetoDos = false;
                break;

                case 4:
                    if (c == 'd') ecEstado = 4;
                    else ecHuboDetoDos = false;
                break;
            }
        }

        if ((ecEstado == 3) || (ecEstado == 4) && ecHuboDetoDos == true) {
            System.out.println("Coord-09    |   abcddddd   |  " + ecHuboDetoDos);
        } else {
            System.out.println("Coord-09    |   abcddddd   |  " + ecHuboDetoDos);
        }

        if (ecHuboDetoUno || ecHuboDetoDos) return true;
        else return false;
    }

}
