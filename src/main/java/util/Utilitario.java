package util;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Utilitario {

    public static boolean existenArchivos(String directorio){
        return Files.exists(Paths.get(directorio));
    }
}
