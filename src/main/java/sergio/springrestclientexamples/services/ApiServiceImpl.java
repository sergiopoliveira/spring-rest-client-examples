package sergio.springrestclientexamples.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import sergio.api.domain.User;
import sergio.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<User> getUsers(Integer limit) {
		
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
		return userData.getData();
	}

}
