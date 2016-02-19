package cyft.nikhila.assign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cyft.nikhila.assign.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);


}
