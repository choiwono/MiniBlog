package my.examples.blog.service;

import my.examples.blog.domain.Role;
import my.examples.blog.repository.RoleRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepositery roleRepositery;

    public void addRole(Role role) {
        Role result = roleRepositery.save(role);
        System.out.println(result.getId() + "," + result.getName());
    }
}
