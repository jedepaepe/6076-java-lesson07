package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BackgroundColorOnClick extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMouseClicked(event -> {
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("background color");
        stage.show();
    }
}
