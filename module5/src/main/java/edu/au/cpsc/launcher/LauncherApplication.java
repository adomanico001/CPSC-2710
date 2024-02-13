/*
* A program that launches four airport-themed buttons.
* Module 5 Application file
*
* @author Addie Domanico - CPSC2710 - AO1
* @version 02/12/2024
 */

package edu.au.cpsc.launcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LauncherApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LauncherApplication.class.getResource("launcher-app.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Launcher");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}