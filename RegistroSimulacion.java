import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {
    public static void main (String []args){
            Path rutaDirectorio = Paths.get("config");
        Path ruta = Paths.get("config/parametros.txt");

        if (Files.exists(ruta)){
            System.out.println("El archivo existe");
        }else {
            System.out.println("El archivo no existe");
        }

        String contenido = "Tiempo de ciclo: 55.8 segundos. \n Velocidad de línea: 1.2 m/s. \n Número de estaciones: 8";

        try {
            Files.write(ruta,contenido.getBytes());
            System.out.println("Archivo escrito con éxito");

            String textoLeido=Files.readString(ruta);
            System.out.println("Contenido leído:");
            System.out.println(textoLeido);
        } catch (IOException e){
            System.out.println("Error al trabajar con archivo: "+e.getMessage());
        }
    }

}
