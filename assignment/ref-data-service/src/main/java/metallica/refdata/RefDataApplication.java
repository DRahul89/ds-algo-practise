package metallica.refdata;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RefDataApplication {
	

    public static void main(String[] args) {
        SpringApplication.run(RefDataApplication.class, args);
    }

}