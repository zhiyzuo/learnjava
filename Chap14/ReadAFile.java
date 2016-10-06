import java.io.*;

class ReadAFile {
    public static void main (String[] args) {
        try {
            File myFile = new File("Foo.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
