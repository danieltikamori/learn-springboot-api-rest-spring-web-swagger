package cc.tkmr.learnspringbootapirestspringwebswagger.repository;

import cc.tkmr.learnspringbootapirestspringwebswagger.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getId() == null) {
            System.out.println("SAVE - Receiving the user in the repository layer");
        } else {
            System.out.println("UPDATE - Receiving the user in the repository layer");
        }
        System.out.println(user);
    }
    public void deleteById(Long id){
        System.out.println(String.format("DELETE/id - Receiving the id: %d to delete an user", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - Listing the system users");
        List<User> users = new ArrayList<>();
        users.add(new User("gleyson","password"));
        users.add(new User("frank","masterpass"));
        return users;
    }
    public User findById(Long id){
        System.out.println(String.format("FIND/id - Receiving the id: %d to locate an user", id));
        return new User("gleyson","password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Receiving the username: %s to locate an user", username));
        return new User("gleyson","password");
    }
}