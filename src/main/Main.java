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

    private static final int WINDOW_WIDTH  = 1366;
    private static final int WINDOW_HEIGHT = 768;

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
        stage.setWidth(WINDOW_WIDTH);
        stage.setHeight(WINDOW_HEIGHT);

        VBox root = new VBox();

        // シーンの作成
        Scene scene = new Scene(root);

        // ウィンドウ表示
        stage.setScene(scene);
        stage.show();
    }
}
