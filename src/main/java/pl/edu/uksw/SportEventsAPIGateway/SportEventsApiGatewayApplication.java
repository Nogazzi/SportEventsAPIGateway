package pl.edu.uksw.SportEventsAPIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import pl.edu.uksw.SportEventsAPIGateway.filters.PreFilter;

@EnableZuulProxy
@SpringBootApplication
public class SportEventsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportEventsApiGatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
}
