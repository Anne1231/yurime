package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.opencv.core.Core;

/**
 * Created by Anne on 2017/02/21.
 */
public class Main extends Application {

    public static void main(String argv[]){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        launch(argv);
    }

    @Override
    public void start(Stage stage){

        InitWindow(stage);

        VBox root = new VBox();
        HBox SideToolBox = new HBox();
        VBox RightObjectsBox = new VBox();
        HBox UpperRight = new HBox();

        HBox preview = new HBox();
        HBox materials = new HBox();
        VBox timeline = new VBox();

        UpperRight.setAlignment(Pos.CENTER);
        UpperRight.setPadding(new Insets(5, 5, 5, 5));
        UpperRight.setSpacing(5.0);
        UpperRight.getChildren().addAll(materials, preview);

        RightObjectsBox.setAlignment(Pos.BOTTOM_RIGHT);
        RightObjectsBox.setPadding(new Insets(5, 5, 5, 5));
        RightObjectsBox.setSpacing(5.0);
        RightObjectsBox.getChildren().addAll(UpperRight, timeline);

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(5, 5, 5, 5));
        root.setSpacing(5.0);
        root.getChildren().addAll(SideToolBox, RightObjectsBox);

        // シーンの作成
        Scene scene = new Scene(root);

        // ウィンドウ表示
        stage.setScene(scene);
        stage.show();
    }

    private static void InitWindow(Stage stage){
        /*
        *ウィンドウの初期設定
         */
        stage.setTitle("Yuri Animation");
        stage.setWidth(Values.WINDOW_WIDTH);
        stage.setHeight(Values.WINDOW_HEIGHT);
    }
}
