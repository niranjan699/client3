package client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZuulClient {
    public static void main ( String[] args ) {

        String uri = "http://localhost:8082/books/checked-out";
        String uri1="http://localhost:8082/service2/checked-out";

        ExecutorService es = Executors.newFixedThreadPool(4);

        es.execute(new GetCallerThread( uri ));
        es.execute(new GetCallerThread( uri ));
        es.execute(new GetCallerThread( uri1 ));
        es.execute(new GetCallerThread( uri1 ));



        es.shutdown();


    }



}
