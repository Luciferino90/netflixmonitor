package it.luciferino.netflixmonitor.handler;

import it.luciferino.netflixmonitor.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TestHandler {

    @Autowired
    private TestService testService;

    public Mono<ServerResponse> test(ServerRequest serverRequest){
        return ServerResponse.ok()
                .body(testService.test(), String.class)
                ;
    }

}
