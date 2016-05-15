package pl.kosmo.javafxprogram;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author kosmeusz
 */
public class App extends Application{

    Button button;

    @Override
    public void start(Stage primaryStage) {
        StackPane layout = new StackPane();
        button = new Button();
        button.setText("Przycisk");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("I'm clicked");
            }
        });

        Scene scene = new Scene(layout, 300, 300);
        layout.getChildren().add(button);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Program");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


}
