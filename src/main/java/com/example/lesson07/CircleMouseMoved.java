package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CircleMouseMoved extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(600, 600);
        double width = canvas.getWidth() / 20;
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        canvas.setOnMouseMoved(event -> {
            gc.setFill(Color.YELLOW);
            gc.fillOval(event.getX() - width / 2, event.getY() - width / 2, width, width);
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("circle mouse moved");
        stage.show();
    }
}
