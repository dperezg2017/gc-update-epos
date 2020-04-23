package controller;

import static util.Constans.*;

import org.apache.log4j.Logger;
import util.Utilitario;



public class ActualizadorController implements Runnable {

    static Logger logger = Logger.getLogger(ActualizadorController.class);

    @Override
    public void run() {

        if(Utilitario.existenArchivos(RUTA_TEST)){
            logger.info("EXISTEN ARCHIVOS!!");
        }else{
            logger.info("NO EXISTEN ARCHIVOS!!");
        }

    }
}
