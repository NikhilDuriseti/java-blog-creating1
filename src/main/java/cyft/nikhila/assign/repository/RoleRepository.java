package cyft.nikhila.assign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cyft.nikhila.assign.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
