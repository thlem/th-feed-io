package th.com.th_api_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Import;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import th.com.th_api_root.AppApi;
import th.com.th_data.ThDataSource;
import th.com.th_data.user.model.UserDao;
import th.com.th_data.user.repository.UserRepository;

@EnableJpaRepositories(basePackages = { "th.com" })
@EntityScan(basePackages = { "th.com" })
@Import({ ThDataSource.class })
public class AppApiClient extends AppApi {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		start(AppApiClient.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("hello world, I have just started up");
		UserDao user = new UserDao();
		user.setName("user_1");
		user = userRepository.save(user);
		System.out.println("USER SAVEs");
		System.out.println(user.getId());
		System.out.println(user.getName());
	}

}
