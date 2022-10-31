package com.example.lesson07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToe9CanvasOnVBox extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        double width = 80;
        double nr = 3;
        double radius = width * 0.8;

        VBox vBox = new VBox();
        for (int i = 0; i < nr * nr; ++i) {
            Canvas canvas = new Canvas(width, width);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.BLACK);
            gc.fillRect(1, 1, width - 1, width - 1);
            double x = (width - radius) / 2;
            canvas.setOnMouseClicked(event -> gc.strokeOval(x, x, radius, radius));
            vBox.getChildren().add(canvas);
        }

        stage.setScene(new Scene(vBox));
        stage.setTitle("TicTacToe 9 Canvas on VBox");
        stage.show();
    }
}
