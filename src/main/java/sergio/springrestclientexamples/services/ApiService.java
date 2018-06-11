package sergio.springrestclientexamples.services;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sergio.api.domain.User;

public interface ApiService {

	List<User> getUsers(Integer limit);
	
	Flux<User> getUsers(Mono<Integer> limit);
}
