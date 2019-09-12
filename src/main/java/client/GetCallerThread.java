package client;

import org.springframework.web.client.RestTemplate;

public class GetCallerThread implements Runnable {

    final String uri ;

    RestTemplate restTemplate = new RestTemplate();

    public GetCallerThread ( String uri ) {
        this.uri = uri;
    }

    @Override
    public void run ( ) {


        while(true) {
            String response = restTemplate.getForObject( uri, String.class );
            System.out.println( response );

        }
    }
}
