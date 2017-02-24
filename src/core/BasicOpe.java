package core;

import javafx.scene.image.Image;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.videoio.VideoWriter;

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
        int base_row = base.rows();
        int image_row = image.rows();
        int base_col = base.cols();
        int image_col = image.cols();
        int begin_x = start_point.getX();
        int begin_y = start_point.getY();
        for(int y = begin_y;y < base_row && iy < image_row; y++, iy++){
            ix = 0;
            for(int x = begin_x;x < base_col && ix < image_col; x++, ix++){
                image.get(iy, ix, color);
                base.put(y, x, color);
            }
        }
    }

    public static void MoveImage(VideoWriter writer, Mat base, Mat move_image, Point2I start, Point2I end, int ms){
        int distance, times;
        double angle, step, stepx, stepy, space;

        //二点間の距離
        distance = (int)start.Distance(end);
        //動かす間隔(ミリ秒)
        space = ms / distance;
        space /= (double)(1000.0 / 60.0);

        //一歩の長さ
        step = 1 / space;
        //動かす回数
        times = (int)(distance / step);
        //角度
        angle = Math.atan((end.getY() - start.getY()) / (end.getX() - start.getX()));
        //xy
        stepx = step * Math.cos(angle);
        stepy = step * Math.sin(angle);

        for(int i = 0;i < times;i++){
            System.out.println(i + "/" + times);
            Mat result = base.clone();
            PasteImage(result, move_image, start);
            start.addX((int)stepx);
            start.addY((int)stepy);
            writer.write(result);
        }
    }

}
