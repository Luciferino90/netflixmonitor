package it.luciferino.netflixmonitor.config;

import it.luciferino.netflixmonitor.handler.TestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


@Configuration
public class RouterConfig {

    @Autowired
    private TestHandler testHandler;

    @Bean
    public RouterFunction<ServerResponse> routingConfiguration(){
        return RouterFunctions
                .route()
                .GET("/testino", testHandler::test)
                .build();
    }


}
