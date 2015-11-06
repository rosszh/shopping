package com.sszd.springjms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	 static String context = null;  
	    static ApplicationContext applicationContext;  
	    static {  
	        context = "classpath:applicationContext-jms.xml";  
	  
	    }  
	public static void main(String[] args) {
		System.out.println("start---");  
        applicationContext = new ClassPathXmlApplicationContext(context);  
        
//		JMSProducer jmsProducer = applicationContext.getBean(JMSProducer.class);
//		 Student student = new Student();  
//		    for (int i = 0; i < 15; i++) {  
//		        student.setName("zzq" + i);  
//		        student.setAge("25");  
//		        jmsProducer.send(student);  
//		        System.out.println("消息已经发送.....");  
//		    }
	}
}
