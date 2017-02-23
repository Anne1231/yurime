package core;

import org.opencv.core.Mat;

/**
 * Created by anne on 17/02/23.
 */
public class BasicOpe {

    /*
    * PasteImageメソッド
    * 画像に画像を貼り付けるメソッド
    * 引数
    * Mat base
    * 下敷き
    * Mat image
    * 貼り付ける画像
    * Point2I start_point
    * 貼り付け始めの位置（左上）
     */
    public static void PasteImage(Mat base, Mat image, Point2I start_point){
        byte[] color = new byte[3];
        int ix, iy = 0;
        for(int y = start_point.getY();y < base.rows() && iy < image.rows(); y++, iy++){
            ix = 0;
            for(int x = start_point.getX();x < base.cols() && ix < image.cols(); x++, ix++){
                image.get(iy, ix, color);
                base.put(y, x, color);
            }
        }
    }
}
