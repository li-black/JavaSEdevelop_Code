package homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> treeSet = new TreeSet<>((o1, o2) ->
        {
            int result = o2.getsum() - o1.getsum();
            result = result == 0 ? o2.getChinese() - o1.getChinese() : result;
            result = result == 0 ? o2.getMath() - o1.getMath() : result;
            result = result == 0 ? o2.getName().compareTo(o1.getName()) : result;
            return result;
        });
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + (i + 1) + "个学生信息：");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);
            treeSet.add(s);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("day12\\src\\file\\l.txt"));
        for (Student student : treeSet) {
            String string = student.toString();
            bw.write(string);
            bw.newLine();
        }
        bw.close();
    }
}

class Student {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getsum() {
        return this.chinese + this.math + this.english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }
}