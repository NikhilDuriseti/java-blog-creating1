package cyft.nikhila.assign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cyft.nikhila.assign.entity.*;


public interface BlogRepository extends JpaRepository<Blog, Integer>{

	List<Blog> findByUser(User user);
}
