package controller;

import static util.Constans.*;

import org.apache.log4j.Logger;
import util.Utilitario;



public class ActualizadorController implements Runnable {

    static Logger logger = Logger.getLogger(ActualizadorController.class);

    Thread hilo;
    String nombre;
    boolean existe;

    public ActualizadorController(String nombre){
        hilo = new Thread(this,"Hilo 1");
        this.existe=Utilitario.existenArchivos(RUTA_TEST);
        hilo.start();
    }
    public void repeatActualizadorController(){
        hilo = new Thread(this,"Hilo N");
        this.existe=Utilitario.existenArchivos(RUTA_TEST);
        hilo.start();
    }


    @Override
    public void run() {

        if(existe){
            logger.info("EXISTEN ARCHIVOS!!");
        }else{
            logger.error("NO EXISTEN ARCHIVOS!!");
            repeatActualizadorController();
        }

    }
}
