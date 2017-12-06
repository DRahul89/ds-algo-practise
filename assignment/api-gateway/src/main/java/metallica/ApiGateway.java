package metallica;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class ApiGateway {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApiGateway.class).web(true).run(args);
	}

}