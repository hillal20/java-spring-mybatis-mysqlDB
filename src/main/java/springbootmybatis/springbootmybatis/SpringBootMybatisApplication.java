package springbootmybatis.springbootmybatis;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springbootmybatis.springbootmybatis.model.User;


@SpringBootApplication
@MapperScan("springbootmybatis.springbootmybatis.mappers")
@MappedTypes(User.class)
public class SpringBootMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootMybatisApplication.class, args);
        System.out.println(" ===== spring myBatis ======");


    }

}
