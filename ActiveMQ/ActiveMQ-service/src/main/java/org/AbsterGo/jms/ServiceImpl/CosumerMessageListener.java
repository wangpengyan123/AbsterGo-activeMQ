package org.AbsterGo.jms.ServiceImpl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class CosumerMessageListener implements MessageListener{

	public void onMessage(Message message) {
		// TODO Auto-generated method stub
	      TextMessage textMsg = (TextMessage) message;   
	        System.out.println("���յ�һ�����ı���Ϣ��");   
	        try {   
	            System.out.println("��Ϣ�����ǣ�" + textMsg.getText());   
	        } catch (JMSException e) {   
	            e.printStackTrace();   
	        }   
	    }   
	}


