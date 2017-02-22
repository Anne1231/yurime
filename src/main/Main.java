package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
        HBox MainBox = new HBox();
        HBox SideToolBox = new HBox();
        VBox RightObjectsBox = new VBox();
        HBox UpperRight = new HBox();

        HBox preview = new HBox();
        HBox materials = new HBox();
        VBox timeline = new VBox();

        MenuBar menu = new MenuBar();
        Menu help = new Menu("Help");
        MenuItem about = new MenuItem("About");
        help.getItems().addAll(about);
        Menu file = new Menu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem create = new MenuItem("Create");
        MenuItem savem = new MenuItem("Save");
        MenuItem quit = new MenuItem("Quit");
        quit.setOnAction(event1 ->
                System.exit(0)
        );

        file.getItems().addAll(open, create, savem, quit);
        menu.getMenus().addAll(file, help);

        UpperRight.setAlignment(Pos.CENTER);
        UpperRight.setPadding(new Insets(5, 5, 5, 5));
        UpperRight.setSpacing(5.0);
        UpperRight.getChildren().addAll(materials, preview);

        RightObjectsBox.setAlignment(Pos.BOTTOM_RIGHT);
        RightObjectsBox.setPadding(new Insets(5, 5, 5, 5));
        RightObjectsBox.setSpacing(5.0);
        RightObjectsBox.getChildren().addAll(UpperRight, timeline);

        MainBox.setAlignment(Pos.CENTER);
        MainBox.setPadding(new Insets(5, 5, 5, 5));
        MainBox.setSpacing(5.0);
        MainBox.getChildren().addAll(SideToolBox, RightObjectsBox);

        root.getChildren().addAll(menu, MainBox);

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
