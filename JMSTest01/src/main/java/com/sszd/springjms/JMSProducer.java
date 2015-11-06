package com.sszd.springjms;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;


/**
 * 利用Spring中的JmsTemplate产生消息
 * 
 */
public class JMSProducer {
	private JmsTemplate jmsTemplate;

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	// 传送一个Student 对象（重写了toString()方法）
	public void send(final Student student) {
		this.jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				MapMessage message = session.createMapMessage();
				message.setString("key1", student.getName());
				message.setString("key2", student.getAge());
                                //也可以直接发送对象，对象必须是可序列化的
                                //ObjectMessage message = session.createObjectMessage();
                                //message.setObject(student);
				return message;
			}
		});
	}
}