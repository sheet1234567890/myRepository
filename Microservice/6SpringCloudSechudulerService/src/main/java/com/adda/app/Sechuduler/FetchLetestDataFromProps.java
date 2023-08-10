package com.adda.app.Sechuduler;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FetchLetestDataFromProps {

	@Scheduled(cron="10 * * * * *")
	public void fetch() 
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("{}", headers);
		RestTemplate rt = new RestTemplate();
		String output=rt.postForEntity("http://laptop-hb10nguk:8099/actuator/refresh", entity, String.class).getBody();
		System.out.println(output);
	}
}
