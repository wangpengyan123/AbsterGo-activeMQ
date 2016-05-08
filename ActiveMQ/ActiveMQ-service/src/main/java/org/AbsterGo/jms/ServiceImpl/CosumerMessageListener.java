package org.AbsterGo.jms.ServiceImpl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class CosumerMessageListener implements MessageListener{

	public void onMessage(Message message) {
		// TODO Auto-generated method stub
	      TextMessage textMsg = (TextMessage) message;   
	        System.out.println("接收到一个纯文本消息。");   
	        try {   
	            System.out.println("消息内容是：" + textMsg.getText());   
	        } catch (JMSException e) {   
	            e.printStackTrace();   
	        }   
	    }   
	}


