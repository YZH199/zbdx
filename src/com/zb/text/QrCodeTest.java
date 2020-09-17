package com.zb.text;

import com.zb.utils.QrCodeUtil;
import org.junit.Test;

import java.util.Scanner;

public class QrCodeTest {
    private static final String QR_CODE_IMAGE_PATH="F:/IDEA/1.png";


    public static void main(String[] args) {
        QrCodeUtil.gernerateQrCodeAndSave
                ("http://baidu.com","png",350,350,QR_CODE_IMAGE_PATH);
    }
    @Test
    public void t1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字A");
        Integer a=sc.nextInt();
        System.out.println("请输入运算符（+-*/");
        String b=sc.next();
        System.out.println("请输入数字C");
        Integer c=sc.nextInt();
        Integer sum=0;
        switch (b){
            case "+" : sum=a+c;break;
            case "-" : sum=a-c;break;
            case "*" : sum=a*c;break;
            case "/" : sum=a/c;break;
        }
        System.out.println(sum);



    }
}
