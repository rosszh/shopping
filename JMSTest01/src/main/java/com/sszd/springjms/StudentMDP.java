package com.sszd.springjms;

import org.apache.log4j.Logger;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * 消息监听类
 * */
public class StudentMDP implements MessageListener {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(StudentMDP.class);

	public void onMessage(Message message) {
		MapMessage mapMessage = (MapMessage) message;
		Student student = new Student();
		try {
			student.setName(mapMessage.getString("key1"));
			student.setAge(mapMessage.getString("key2"));
			logger.info(student.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(student.getName());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}