package it.luciferino.netflixmonitor.persistence.repository;

import it.luciferino.netflixmonitor.persistence.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

    Mono<User> findByUsername(String username);

}
