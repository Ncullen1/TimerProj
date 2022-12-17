import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class timeToLocation extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button startTravel = new Button("Start travel?");
        startTravel.setOnAction(e -> {
            MyJavaFXProgram myProgram = new MyJavaFXProgram();
            showInModalWindow(myProgram.getView());
        });
        Button exitButton = new Button("Track stop");
        exitButton.setOnAction(e -> Platform.exit());

        VBox root = new VBox(10, exitButton, startTravel);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showInModalWindow(Parent view) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(view));
        stage.show();
    }


}
