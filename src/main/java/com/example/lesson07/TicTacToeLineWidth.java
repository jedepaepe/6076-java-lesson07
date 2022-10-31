package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeLineWidth extends Application {
    @Override
    public void start(Stage stage) {
        double lineWidth = 5;
        double columnWidth = 100;
        double radius = columnWidth - 20;
        double nrColumns = 3;
        Canvas canvas = new Canvas(nrColumns * columnWidth + 2 * lineWidth, nrColumns * columnWidth + 2 * lineWidth);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        gc.setLineWidth(lineWidth);
        gc.setStroke(Color.WHITE);
        for (int i = 1; i < nrColumns; ++i) {
            double position = i * columnWidth + (i - 1) * lineWidth;
            gc.strokeLine(position, 0, position, canvas.getHeight());
            gc.strokeLine(0, position, canvas.getWidth(), position);
        }

        gc.setFont(new Font("Courier new", 80));

        canvas.setOnMouseClicked(event -> {
            double xIndex = Math.floor(event.getX() / (columnWidth + lineWidth / 2));
            double yIndex = Math.floor(event.getY() / (columnWidth + lineWidth / 2));
            double x = xIndex * columnWidth + Math.max(0, xIndex - 1) * lineWidth + (columnWidth - radius) / 2;
            double y = yIndex * columnWidth + Math.max(0, yIndex - 1) * lineWidth + (columnWidth - radius) / 2;
            System.out.println(event.getX() + " " + xIndex + " " + x);
            System.out.println(event.getY() + " " + yIndex + " " + y);
            gc.setStroke(Color.WHITE);
            gc.strokeOval(x, y, radius, radius);
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("tic tac toe");
        stage.show();
    }
}
