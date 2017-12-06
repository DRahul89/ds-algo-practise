package metallica.trade.mbean;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import metallica.trade.model.TradeCommand;

/**
 * 
 * a class to send message about trade status
 *
 */
@Service
public class TradeMessageSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	@Value("${trade.rabbitmq.exchange}")
	private String exchange;

	@Value("${trade.rabbitmq.routingkey}")
	private String routingkey;

	public void sendTradeCommand(TradeCommand tradeCommand) {
		rabbitTemplate.convertAndSend(exchange, routingkey, tradeCommand);

	}
}
