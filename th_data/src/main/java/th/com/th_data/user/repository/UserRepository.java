package th.com.th_data.user.repository;

import org.springframework.data.repository.CrudRepository;

import th.com.th_data.user.model.UserDao;

public interface UserRepository extends CrudRepository<UserDao, Long>{

}
