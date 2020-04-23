package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class Main {

    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args){

        Properties properties = new Properties();

        URL url = Loader.getResource("log4j.properties");
        PropertyConfigurator.configure(url);

        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream input = classLoader.getResourceAsStream("application.properties");
            properties.load(input);
            if (properties.getProperty("update.epos").equalsIgnoreCase("test-update")) {
                logger.info("test-properties");
            }
        }catch (IOException e){
            logger.error("Ocurrio un error al iniciar el application.properties :",e);
        }
        ActualizadorController actualizadorController1 = new ActualizadorController("N1");
        ActualizadorController actualizadorController2 = new ActualizadorController("N2");


    }


}
