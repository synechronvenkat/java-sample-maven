package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {
	@Autowired
	Component component;
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		
		//builder.buildRequestFactory();
		/*
		 * CloseableHttpClient httpClient = HttpClients.custom()
		 * .setSSLHostnameVerifier(new NoopHostnameVerifier()) .build();
		 * HttpComponentsClientHttpRequestFactory requestFactory = new
		 * HttpComponentsClientHttpRequestFactory();
		 * requestFactory.setHttpClient(httpClient);
		 */
		
	}
	
	@Bean
	
	public RestTemplate getRestTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}
	
	public  void call()
	{ 
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		component.call();
		
	}

}
