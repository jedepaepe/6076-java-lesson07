package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ClickOnSquareWithText extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double width = canvas.getWidth() * 2 / 3;
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillRect(canvas.getHeight() / 2 - width / 2, canvas.getHeight() / 2 - width / 2, width, width);
        gc.setFill(Color.BLACK);
        gc.setFont(new Font("courier new", 16));
        gc.fillText("(x,y)", 80, 92);
        gc.fillText("width", 280, 92);
        gc.fillText("width", 43, 310);
        gc.fillText("(x+width,y/width)", 420, 520);
        gc.fillOval(98, 98, 4, 4);
        gc.fillOval(498, 498, 4, 4);

        canvas.setOnMouseClicked(event -> {
            double x = canvas.getHeight() / 2 - width / 2;
            double y = canvas.getHeight() / 2 - width / 2;
            if (x < event.getX() && event.getX() < canvas.getWidth() - x &&
                y < event.getY() && event.getY() < canvas.getHeight() - y) {
                gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                gc.fillRect(x, y, width, width);
            }
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carré click -> nouvelle couleur aléatoire");
        stage.show();
    }
}
