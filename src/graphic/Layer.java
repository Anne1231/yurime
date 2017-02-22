package graphic;

/**
 * Created by Anne on 2017/02/22.
 */
public class Layer {

    short x;        //表示するX座標
    short y;        //表示するY座標
    short width;    //レイヤーの幅
    short height;   //レイヤーの高さ

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
