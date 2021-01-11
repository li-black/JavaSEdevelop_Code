package homework;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day12\\src\\file\\word.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day12\\src\\file\\g.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            line = line.replace("{userName}", "宋晓峰").replace("{name}", "好湿");
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
