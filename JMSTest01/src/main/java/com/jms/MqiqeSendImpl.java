package com.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class MqiqeSendImpl implements IMqiqeSend {

	@Override
	public void send(final String motorist) {
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				MapMessage message = session.createMapMessage();
				message.setString("lastName", "fg\n");
				message.setString("firstName", "mqiqe\n");
				message.setString("messageStr", motorist);
				return message;
			}
		});
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
