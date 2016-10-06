import java.io.*;

public class Box implements Serializable{
    private int width;
    private int height;

    public Box() {
        width = 10;
        height = 10;
    }

    public Box(int w, int h) {
        width = w;
        height = h;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
