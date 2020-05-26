package springbootmybatis.springbootmybatis.mappers;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Component;
import springbootmybatis.springbootmybatis.model.User;

import java.util.List;

@Component
@Mapper
public interface UserMapper {


    @Select("create table users ( id int not null auto_increment, name varchar(100) not null, salary varchar(100) not null, primary key (id) );")
    void createUserTable();

     // all users
    @Select("select * from user;")
    List<User> findAllUsers();


    // update the user
    @Insert("insert into user(name,salary) values(#{name}, #{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    void insertUser(User user);

}
