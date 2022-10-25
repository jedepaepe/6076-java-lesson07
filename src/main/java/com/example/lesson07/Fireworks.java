package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Fireworks extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.color(0, 0, 0.1));
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        canvas.setOnMouseClicked(mouseEvent -> {
            gc.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            for (int i = 0; i < 100; ++i) {
                double x = mouseEvent.getX() + (Math.random() - 0.5) * canvas.getWidth() * 0.8;
                double y = mouseEvent.getY() + (Math.random() - 0.5) * canvas.getHeight() * 0.8;
                gc.strokeLine(mouseEvent.getX(), mouseEvent.getY(), x, y);
            }
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("feux d'artifices");
        stage.show();
    }
}
