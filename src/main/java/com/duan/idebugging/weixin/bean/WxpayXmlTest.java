package com.duan.idebugging.weixin.bean;

import com.thoughtworks.xstream.XStream;

/**
 * Created by xiangdong.duan on 2017/6/1.
 */
public class WxpayXmlTest {
    public static void main(String[] args) {
        XStream xstream = new XStream();
        xstream.processAnnotations(WxPayOrder.class);
        WxPayOrder wxPayOrder = new WxPayOrder("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        String bodyXml = xstream.toXML(wxPayOrder);
        System.out.println("请求报文:" + bodyXml);
    }
}
