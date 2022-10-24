package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ClickSquare extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double width = canvas.getWidth() * 2 / 3;
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillRect(canvas.getHeight() / 2 - width / 2, canvas.getHeight() / 2 - width / 2, width, width);

        canvas.setOnMouseClicked(event -> {
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            gc.fillRect(canvas.getHeight() / 2 - width / 2, canvas.getHeight() / 2 - width / 2, width, width);
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carré click -> nouvelle couleur aléatoire");
        stage.show();
    }
}
