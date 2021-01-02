package com.itheima.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//SimpleDateFormat秒杀活动的判断
public class Test2 {
    public static void main(String[] args) throws ParseException {
        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";
        String jia = "2020年11月11日 0:3:47";
        String pi = "2020年11月11日 0:10:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = sdf.parse(start).getTime();
        long endtTime = sdf.parse(end).getTime();
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();
        if (jiaTime >= startTime && jiaTime <= endtTime) {
            System.out.println("小贾秒杀成功");
        } else {
            System.out.println("小贾秒杀失败");
        }
        if (piTime >= startTime && piTime <= endtTime) {
            System.out.println("小皮秒杀成功");
        } else {
            System.out.println("小皮秒杀失败");
        }
    }
}
