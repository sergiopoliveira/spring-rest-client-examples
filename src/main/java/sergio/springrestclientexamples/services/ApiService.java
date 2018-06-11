package sergio.springrestclientexamples.services;

import java.util.List;

import sergio.api.domain.User;

public interface ApiService {

	List<User> getUsers(Integer limit);
}
