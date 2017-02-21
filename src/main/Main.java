package main;

import javafx.application.Application;
import javafx.scene.Scene;
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

        /*
        *ウィンドウの初期設定
         */
        stage.setTitle("Yuri Animation");
        stage.setWidth(Values.WINDOW_WIDTH);
        stage.setHeight(Values.WINDOW_HEIGHT);

        VBox root = new VBox();

        // シーンの作成
        Scene scene = new Scene(root);

        // ウィンドウ表示
        stage.setScene(scene);
        stage.show();
    }
}
