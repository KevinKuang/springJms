package lazyhome.jms.consumer;

import org.springframework.context.annotation.Bean;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 2017/9/7.
 */
public class ConsumerMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage)message;
        try {
            System.out.println("get message: "+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
