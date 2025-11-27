import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ecInformacion {
    public ecInformacion (){
    }

    public void ecMostrarInformación (){


        System.out.println("[+] INFORMACIÓN:\n- Nombre: Erick Sebastián Chicaiza Diaz\n- Cédula: 1756172894\n\n[+] COORDENADAS UCRANIANAS");

        String ecArchivo = "src/ChicaizaErick.csv";
        String ecLinea;

        try (BufferedReader br = new BufferedReader(new FileReader(ecArchivo))) {

            System.out.println("Loading     | Geoposición| Lunes   | Martes  | Miércoles  | Jueves  | Viernes | Tipo Arsenal");
            br.readLine();

            while ((ecLinea = br.readLine()) != null) {

                for (int i = 0; i <= 100; i++) {
                    try {
                        System.out.printf("\r%s %d%%", (i % 2 == 0) ? "o0o" : "0o0", i);
                        System.out.flush();
                        Thread.sleep(25);
                    } catch (InterruptedException e) {
                        System.out.println("Carga interrumpida");
                    }
                }

                System.out.print("\r100%       ");

                String[] col = ecLinea.split(";");

                System.out.printf(" | %-10s | %-7s | %-7s | %-10s | %-7s | %-7s | %-12s%n",
                        col[0],
                        col.length > 1 ? col[1] : "",
                        col.length > 2 ? col[2] : "",
                        col.length > 3 ? col[3] : "",
                        col.length > 4 ? col[4] : "",
                        col.length > 5 ? col[5] : "",
                        col.length > 6 ? col[6] : ""
                );
            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        
    }
}
