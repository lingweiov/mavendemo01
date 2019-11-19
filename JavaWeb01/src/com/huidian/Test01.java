package com.huidian;/*
@outhor shkstart
@date 2019/11/19-20:52
*/

import javax.sound.midi.Soundbank;
import javax.sql.rowset.serial.SQLOutputImpl;

public class Test01 {
    public static void main(String[] args) {
       //自动类型转换:从小到大
        long num=100;
        System.out.println(num);
        //int num1=100L;错误
        double num2=100f;
        //float num3=100d;错误
        //强制转换，代码需要进行特殊的格式处理，不能直接自动转化
        int num1=(int)100L;
        float num3=(float)100d;
        //强制转换，谨慎使用，容易溢出
        //int num4=20000000000;错误
        int num4=(int) 20000000000l;//会溢出
        System.out.println(num4);
        //int num5=(Integer)20000000000l;
         int num6=(int) 3.8;//3
        char a='A';
        System.out.println(a+1);//66

    }
}
