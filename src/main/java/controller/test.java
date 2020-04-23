package controller;

import static util.Constans.*;

import org.apache.log4j.Logger;
import util.Utilitario;



public class test implements Runnable {

    static Logger logger = Logger.getLogger(ActualizadorController.class);

    Thread hilo;
    String nombre;

    public test(String nombre){
        this.nombre=nombre;
        hilo = new Thread(this,"Hilo 1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo.start();
    }


    @Override
    public void run() {

        try{
            for(int i=0;i<200;i++){
                logger.info(nombre+" - valor: "+i);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

//        boolean existe = Utilitario.existenArchivos(RUTA_TEST);
//
//        while(existe==false){
//            logger.info("NO EXISTEN ARCHIVOS!!");
//        }
//
//        logger.info("EXISTEN ARCHIVOS!!");
    }
}
