package my.examples.blog.repository;

import my.examples.blog.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepositery extends JpaRepository<Role, Long> {
}
