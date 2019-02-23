package it.luciferino.netflixmonitor.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TestService {

    public Mono<String> test(){
        return Mono.just("HelloWorld");
    }

}
