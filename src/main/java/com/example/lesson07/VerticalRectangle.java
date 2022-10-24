package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class VerticalRectangle extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLUE);
        gc.fillRect(0, 0, canvas.getWidth() / 2, canvas.getHeight());
        gc.setFill(Color.PURPLE);
        gc.fillRect(canvas.getHeight() / 2, 0, canvas.getWidth(), canvas.getHeight());

        canvas.setOnMouseMoved(event -> {
            System.out.println(event.getX() + " " + event.getY());
            if (event.getX() < canvas.getWidth() / 2) {
                gc.setFill(Color.AQUA);
                gc.fillRect(0, 0, canvas.getWidth() / 2, canvas.getHeight());
                gc.setFill(Color.PURPLE);
                gc.fillRect(canvas.getHeight() / 2, 0, canvas.getWidth(), canvas.getHeight());
            } else {
                gc.setFill(Color.BLUE);
                gc.fillRect(0, 0, canvas.getWidth() / 2, canvas.getHeight());
                gc.setFill(Color.PINK);
                gc.fillRect(canvas.getHeight() / 2, 0, canvas.getWidth(), canvas.getHeight());
            }
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("rectangles placés verticalement");
        stage.show();
    }
}
