import java.io.*;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            inputLine = br.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }
}
