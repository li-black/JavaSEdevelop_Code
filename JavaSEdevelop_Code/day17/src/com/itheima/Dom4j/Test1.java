package com.itheima.Dom4j;
//用dom4j读取xml中的文件获取信息并封装成Student对象打印

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws DocumentException {
//        创建SAXReader对象并读取文件
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("day17\\src\\xml\\student.xml");
//        获取根目录的标签
        Element rootElement = read.getRootElement();
//        获取根目录下的student标签返回集合
        List<Element> elements = rootElement.elements("student");
//        创造list集合存储Student对象
        ArrayList<Student> list = new ArrayList<>();
//        遍历集合
        for (Element element : elements) {
//            获取student标签的attribute
            Attribute attribute = element.attribute("id");
//            获取attribute的值
            String id = attribute.getValue();
//            获取student标签下的name标签
            Element nameElement = element.element("name");
//            获取name标签的值
            String name = nameElement.getText();
//            获取student标签下的age标签
            Element ageElement = element.element("age");
//            获取age标签的值
            String age = ageElement.getText();
//            将id，name，age封装成对象
            Student student = new Student(id, name, Integer.parseInt(age));
//            将对象存入list集合
            list.add(student);
        }
//        遍历list集合打印Student对象
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
