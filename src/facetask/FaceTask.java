/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facetask;

import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author ikort
 */
public class FaceTask extends Application {
    
    Circle faceCircle(double d, double d1, double d2, double strokeWidth, double centerX, double centerY) {
        Circle circle = new Circle(d, d1, d2);
        circle.setFill(Color.BISQUE);
        circle.setStrokeWidth(strokeWidth);
        circle.setStroke(Color.BLACK);
        circle.setCenterX(centerX);
        circle.setCenterY(centerY);
        return circle;
    }
    
    Pane faceComponentPane() {
        Ellipse leftEye = new Ellipse(110, 85, 20, 10);
        Ellipse rightEye = new Ellipse(190, 85, 20, 10);
        Polygon nose = new Polygon(150, 110, 170, 160, 130, 160);
        Arc mouse = new Arc(150, 180, 50, 25, 180, 180);
        Pane facePane = new Pane();
        facePane.getChildren().addAll(faceCircle(10, 10, 100, 4, 150, 125), leftEye, rightEye, nose, mouse);
        return facePane;
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Scene scene = new Scene(faceComponentPane(), 300, 250);
        primaryStage.setTitle("Face..!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}