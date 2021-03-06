package com.dino;

import com.dino.engine.Engine;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Dimitrije Muzur
 */
public class Main extends Application{
    public static final String TITLE = "Dino Run";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        primaryStage.setTitle(TITLE);

        Engine engine = new Engine();
        Scene scene = new Scene(engine);
        primaryStage.setScene(scene);
        
        engine.init();
        engine.start();
        
        primaryStage.setOnCloseRequest((event) -> {
            engine.stop();
        });
        
        primaryStage.show();
    }
}
