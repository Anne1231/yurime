package core;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import java.io.File;

/**
 * Created by Anne on 2017/02/22.
 */
public class ImageIO {

    private static FileChooser image_selecter = new FileChooser();

    /*
    * GetImagePath関数
    * 画像を開いて、パスを取得する関数
     */
    public static String GetImagePath(Stage stage) {

        image_selecter.setTitle("File select");
        image_selecter.getExtensionFilters().add(new FileChooser.ExtensionFilter("イメージファイル", "*.jpg", "*.png"));

        File img_file = image_selecter.showOpenDialog(stage);

        if(img_file != null) {
            return img_file.getPath().toString();
        }else{
            return null;
        }
    }

    /*
    * SelectAndOpenImage関数
    * 画像を選択し、開く処理を一度にこなす関数
     */
    public static Mat SelectAndOpenImage(Stage stage){
        String path = GetImagePath(stage);
        return OpenImageWithPath(path);
    }

    /*
    * OpenImageWithPath関数
    * 引数としてパスを受け取り、その画像を開く関数
     */
    public static Mat OpenImageWithPath(String path){
        if(!path.isEmpty()){
            Mat img = Imgcodecs.imread(path);
            return img;
        }else{
            return null;
        }
    }
}
