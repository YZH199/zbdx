package com.zb.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102500760502";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCBccqRJ2atV7NJhIvDjzkvM4JgKQGGKXxhBBvTOQ47RgcDAgXHs9M1A+wK8cUrTLYXSOFc4kqoVp+J/djf12xvcvEAMEHR0Nf1adW8DVr1GVz4Ix7hNu4DZtThWBCrepC7fRSaO8Y0flgk0nP6MyGDz+QahCKcUKNwS1lv34vEiNaJ1UwBO8GfvtIClshsUpiyg8HkTTjpkymUey/FJvbwAM7EWetNRLJhfqpHkP+3FI58qStp4tYaMLzzg2a3UdpNWXNwczcAX7h2pMnS/bVXJ5A/Sctyh/lsU1HkopZPZ6uE0pRME8JP94vYKsR5BLmtLYWSxBWDlu4TFT6DpGz5AgMBAAECggEAO1M/l48LS96p2MPammIFv1BILHIetLJGwt/zMLcxgpDxnbtLkt8jqWSGxe1QhCvAOKO6Raugs84fiErDHrPIiruPIJr9T3/7ugorXuhwC2z4YvEVsfpO01hJsI1/9ldSBdupmZZTnLNbCmU5qi3M6nBZBp4QjruWbFzcPJ2jnQrBWnxvlCBmbJ3GkpWipvWplmUXaZQAMzttiSwnQChwKKUoQcbHEPzeGAdCDAmCswtiaQUPbFeLh0cj5HE68Fh1L+KS4rtPRJTNzeDfA8BemQIuPwnW4J6WAQNGdoalKZUjE2XYd3TJAQEE/6QCVF83uAPviMLf2g8RNOSJxBieQQKBgQDR5XR/U4syts8D1JdXhGbngGdCMUAOChyrmB+hOddn8RGGBnOrQANZ/YpS4UqOYYF2C1ov1/ecai0ySUnejIWstuoh4SqT2aTlAn1+jC2guLiu1zGjWiuXV2m+AzYkVzk3XXnRYE0NEkpsiBXHQMND2tMdughr3li9CKZ3Qi5HLQKBgQCd4IB85bzgwdS+L/B2w8evl8lDiaJXO9KI/hT7XVKfy068OM+SUZxys8DYGrrpxy/XDMZEr7C5TjbKJgnxtDH3CW489O262LEOI1Tm7/NYnxu8RQM1IbCRrZn58BumGEbkcxecqIBNnmnOitCMgcelsalVXNIXG7krUEXycgXcfQKBgD2v/x4Qsp9UBOFuUJBjFE9DeJWGnfnCVQzFZ75dnoYo3mqSaNpStOl0z3tuRRg1ZfQIgBgBk/8/YUsfKPukNwE8vPD6GSZc186KfdF8Z0iOIZEZI7iLnrYa9bPng7kIfYNdEJlNgTevQXpGQIhP61N884EQFLuHHHNqIGp6Y9l9AoGAcnSHsgR74hWjvh3THsbgxZQs/SGS59sezuIlI/aMJ/ykoCAvm8w+t4lJjWITj9gv/p/sPW+Bl1X0sqjRHMGeV5ImsVp/3q2p7q3+p03eBamT2fHOWX6LG5HXxzMjWE7RVl16CMDAA4WM/4fzmWmc66rZMGGSjd4zaAtSKmovhaECgYEAz8+mGUDMhEz0XpNBq+VgjYv++6XXIjsagK+CLkin843Bt8Sr8GY2tBgD7DQKMCXmLuOM4L6y0iCtluYTQbq6Ku4ZOB5iidzFpCT6rdmtPrqB7Mk8E2kaQeQU2cM0jgXGSxA1y1Z+IdaW+8pZ785exMDlHDsaFgcvZgFd0kX/3a8=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgXHKkSdmrVezSYSLw485LzOCYCkBhil8YQQb0zkOO0YHAwIFx7PTNQPsCvHFK0y2F0jhXOJKqFafif3Y39dsb3LxADBB0dDX9WnVvA1a9Rlc+CMe4TbuA2bU4VgQq3qQu30UmjvGNH5YJNJz+jMhg8/kGoQinFCjcEtZb9+LxIjWidVMATvBn77SApbIbFKYsoPB5E046ZMplHsvxSb28ADOxFnrTUSyYX6qR5D/txSOfKkraeLWGjC884Nmt1HaTVlzcHM3AF+4dqTJ0v21VyeQP0nLcof5bFNR5KKWT2erhNKUTBPCT/eL2CrEeQS5rS2FksQVg5buExU+g6Rs+QIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "localhost:8080/zbdx/YzzPaySuccessServlet";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "localhost:8080/zbdx/Yzzpaysuccess.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

