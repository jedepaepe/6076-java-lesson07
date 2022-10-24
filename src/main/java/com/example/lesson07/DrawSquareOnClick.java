package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DrawSquareOnClick extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        canvas.setOnMouseClicked(event -> {
            gc.setFill(Color.YELLOW);
            gc.fillRect(event.getX(), event.getY(), 30, 30);
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("dessinons un carré à chaque click");
        stage.show();
    }
}
