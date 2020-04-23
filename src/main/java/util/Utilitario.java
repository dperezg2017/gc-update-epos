package util;


import org.apache.log4j.Logger;

import java.io.File;

public class Utilitario {

    static Logger logger = Logger.getLogger(Utilitario.class);

    public static boolean existenArchivos(String directorio){

        File file = new File(directorio);

        boolean existe = (file.listFiles().length==0)?false:true;

        return existe;
    }
}
