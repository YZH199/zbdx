package com.zb.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;

public class QrCodeUtil {
    //创建二维码图片输出流
    private static final QRCodeWriter QR_CODE_WRITER=new QRCodeWriter();





    public static void gernerateQrCodeAndSave
            (String text,String format,int width,int height,String path){
        try {
            //解决中文乱码
            HashMap hashMap=new HashMap();
            hashMap.put(EncodeHintType.CHARACTER_SET,"UTF-8");
            //二维码姿信息对象
            BitMatrix bitMatrix=QR_CODE_WRITER.encode(text, BarcodeFormat.AZTEC.QR_CODE,width,height);
            //将二维码信息转变成图
            MatrixToImageWriter.writeToPath(bitMatrix,format, Paths.get(path));
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
