package homework;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day12\\src\\file\\e.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day12\\src\\file\\f.txt"), "utf-8");
        int by;
        while ((by = isr.read()) != -1) {
            osw.write(by);
        }
        isr.close();
        osw.close();
    }
}
