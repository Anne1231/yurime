package graphic;

import org.opencv.core.Mat;

/**
 * Created by Anne on 2017/02/22.
 */
public class Layer {

    Short x;        //表示するX座標
    Short y;        //表示するY座標
    Short width;    //レイヤーの幅
    Short height;   //レイヤーの高さ
    Mat buffer;     //レイヤーの画像

    /*
    * コンストラクタとか
     */
    public Layer(Short x, Short y, Short width, Short height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Layer(Short x, Short y, Short width, Short height, Mat img){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        img.copyTo(this.buffer);
    }

    public Layer(){
    }

    /*
    * getter/setterの定義
     */
    public short getX(){
        return x;
    }

    public short getY() {
        return y;
    }

    public short getWidth() {
        return width;
    }

    public short getHeight() {
        return height;
    }

    public void setX(short x) {
        this.x = x;
    }

    public void setY(short y) {
        this.y = y;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public void setHeight(short height) {
        this.height = height;
    }

}
