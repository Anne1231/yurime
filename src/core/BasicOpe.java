package core;

import org.opencv.core.Mat;
import org.opencv.core.Point;

/**
 * Created by anne on 17/02/23.
 */
public class BasicOpe {

    public static void PasteImage(Mat base, Mat image, Point2I start_point){
        byte[] color = new byte[3];
        int ix = 0, iy = 0;
        for(int y = start_point.getY();y < base.rows(); y++, iy++){
            for(int x = start_point.getX();x < base.cols(); x++, ix++){
                image.get(iy, ix, color);
                base.put(y, x, color);
            }
        }
    }
}
