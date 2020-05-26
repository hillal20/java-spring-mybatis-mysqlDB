package springbootmybatis.springbootmybatis.usersControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootmybatis.springbootmybatis.mappers.UserMapper;
import springbootmybatis.springbootmybatis.model.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

   @Autowired
    UserMapper userMapper;

    @GetMapping("/all")
    public List<User> getAllUsers(){
       return  userMapper.findAllUsers();

    }

    @GetMapping("/createUsers") // i used this end point only one time just  to check to create a table for users
    public void  createUserTable(){
        userMapper.createUserTable();

    }


    @GetMapping("/update")
    public List<User> updateUser(){

          User user = new User();
          user.setName("user-1");
          user.setSalary("2000");

          userMapper.insertUser(user);

      return  userMapper.findAllUsers();

    }
}
