package core;

/**
 * Created by anne on 17/02/23.
 */
/*
* 二次元座標を保持するクラス
 */
public class Point2I {

    private int x;  //X値
    private int y;  //Y値

    /*
    * コンストラクタ
     */
    public Point2I(int x, int y){
        this.x = x;
        this.y = y;
    }

    public  Point2I(){
        this.x = 0;
        this.y = 0;
    }

    /*
    * getter/setter
     */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2I clone(){
        return new Point2I(this.x, this.y);
    }
}
