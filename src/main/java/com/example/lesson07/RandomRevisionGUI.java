package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RandomRevisionGUI extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.color(0, Math.random(), 0));
        gc.fillOval(0, 0, canvas.getWidth(), canvas.getHeight());

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("vert aléatoire");
        stage.show();
    }
}
