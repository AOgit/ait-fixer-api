package ait.fixer;

import ait.fixer.dto.FixerResult;
import ait.fixer.utils.DataFromConsole;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


public class FixerAppl {
   private static final String apiUrl = "https://api.apilayer.com/fixer/convert";
   private static final String apiKey = "8xv3gu7nzX49OnF5p0N6AgWxxHbbfOCs";

    public static void main(String[] args) {
        DataFromConsole dataFromConsole = new DataFromConsole();
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("apikey",  apiKey);
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromHttpUrl(apiUrl)
                .queryParam("to", dataFromConsole.getTo())
                .queryParam("from", dataFromConsole.getFrom())
                .queryParam("amount", dataFromConsole.getAmount());
        URI url = builder.build().toUri();
        RequestEntity<String> request = new RequestEntity<>(headers, HttpMethod.GET, url);
        ResponseEntity<FixerResult> response = restTemplate.exchange(request, FixerResult.class);
        String result = response.getBody().getResult();
        String currency = response.getBody().getQuery().get("to");
        System.out.printf("Result: %s %s\n", result, currency);

    }

}
