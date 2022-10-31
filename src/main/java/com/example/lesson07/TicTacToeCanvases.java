package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeCanvases extends Application {
    @Override
    public void start(Stage stage) {
        double columnWidth = 100;
        double margin = 10;
        double radius = columnWidth - 2 * margin;
        double nrColumns = 3;
        GridPane gridPane = new GridPane();

        for (int x = 0; x < nrColumns; ++x) {
            for (int y = 0; y < nrColumns; ++y) {
                Canvas canvas = new Canvas(columnWidth, columnWidth);
                gridPane.add(canvas, x, y);
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.setFill(Color.BLACK);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setStroke(Color.WHITE);
                gc.strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
                canvas.setOnMouseClicked(event -> gc.strokeOval(margin, margin, radius, radius));
            }
        }
        stage.setScene(new Scene(gridPane));
        stage.setTitle("tic tac toe");
        stage.show();
    }
}
