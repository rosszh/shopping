package com.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;

import org.springframework.jms.core.JmsTemplate;

public class MqiqeReceiverImpl implements IMqiqeReceiver {
	@Override
	public String reveiver() throws JMSException {
		System.out.println("开始接受信息。。。");
		MapMessage message = (MapMessage) jmsTemplate.receive();
		String str = "lastName:" + message.getString("lastName") + "firstName:"
				+ message.getString("firstName") + "messageStr:"
				+ message.getString("messageStr");
		System.out.println("接受完信息。。。");
		return str;
	}

	private JmsTemplate jmsTemplate;

	/**
	 * @param jmsTemplate
	 *            the jmsTemplate to set
	 */
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
}
