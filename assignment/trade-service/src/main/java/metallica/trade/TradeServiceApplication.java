package metallica.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TradeServiceApplication {

	
	public static void main(String[] args) {
		/*TradeData td = new TradeData();
		td.setTradeId(BigInteger.valueOf(1));
		td.setSide(Side.BUY);
		td.setTradeDate(LocalDate.now().toString());
		td.setCommodityId("abc");
		td.setCounterPartId(BigInteger.valueOf(2));
		td.setLocationId("abc");
		td.setPrice(20.7);
		td.setQuantity(20);
		td.setTradeStatus(TradeStatus.OPEN);
		td.setUserId(BigInteger.valueOf(0));
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(td));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		SpringApplication.run(TradeServiceApplication.class, args);
	}
}
