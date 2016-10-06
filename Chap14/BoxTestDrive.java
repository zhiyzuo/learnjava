import java.io.*;

public class BoxTestDrive {
    public static void main (String[] args) {
        Box box = new Box(5, 8);
        System.out.println("Width: " + box.getWidth()); System.out.println("Height: " + box.getHeight());
        // save
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("box.ser"));
            os.writeObject(box);
        } catch (IOException e) {
            e.printStackTrace();
        }

        box = null;

        // try load it back
        try {
            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream("box.ser"));
            Box b = (Box) is.readObject();
            System.out.println("Show loaded box info --");
            System.out.println("Width: " + b.getWidth());
            System.out.println("Height: " + b.getHeight());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
