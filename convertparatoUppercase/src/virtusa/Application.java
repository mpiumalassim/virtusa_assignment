package virtusa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application extends BufferedReader {

    public Application(Reader in) {
        super(in);
    }

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\para.txt");
        Application obj = new Application(new FileReader(file));
        String str;

        List<String> list = new ArrayList<>();
        while ((str = obj.readLine()) != null) {
            list.add(str);
        }
        String[] stringArr = list.toArray(new String[0]);
        obj.read(stringArr);

    }

    public int read(String[] a) {
        for (String num : a) {
            String name = num;
            int nameLenght = name.length();
            int temp = 0;
            for (int i = 0; i < nameLenght; i++) {
                char character = name.charAt(i);
                temp = (int) character;
                if (temp <= 122 && temp >= 97) {
                    temp = temp - 32;
                    character = (char) temp;
                }
                System.out.print(character);
            }
        }
        return 0;
    }
}
