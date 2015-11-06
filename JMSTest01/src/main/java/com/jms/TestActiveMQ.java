package com.jms;

import javax.jms.JMSException;  

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
  
public class TestActiveMQ {  
    static String context = null;  
    static ApplicationContext applicationContext;  
    static {  
        context = "classpath:applicationContext.xml";  
  
    }  
  
    public static void main(String[] arg) {  
        System.out.println("start---");  
        applicationContext = new ClassPathXmlApplicationContext(context);  
        IMqiqeSend demoSend = (IMqiqeSend) applicationContext.getBean("mqiqeSend");  
        IMqiqeReceiver mqiqeReceiver=  (IMqiqeReceiver)applicationContext.getBean("mqiqeReceiver");  
        System.out.println(demoSend);  
        demoSend.send("hello,world!");  
        System.out.println("send Message:hello,world!");  
        try {  
            System.out.println(mqiqeReceiver.reveiver());  
        } catch (JMSException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        System.out.println("end");  
    }  
}  