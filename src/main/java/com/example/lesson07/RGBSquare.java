package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RGBSquare extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.color(0.25, 1, 0.75));
        gc.fillRect(50, 50, 300, 300);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carré rgb");
        stage.show();
    }
}
