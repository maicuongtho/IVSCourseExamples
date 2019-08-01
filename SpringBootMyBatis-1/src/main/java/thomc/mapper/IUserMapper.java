package thomc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import thomc.model.User;

public interface IUserMapper {
	    @Insert("insert into users(name,email) values(#{name},#{email})")
	    @SelectKey(statement="call identity()", keyProperty="id",
	    before=false, resultType=Integer.class)
	    void insertUser(User user);
	    @Select("select id, name, email from users WHERE id=#{id}")
	    User findUserById(Integer id);
	    @Select("select id, name, email from users")
	    List<User> findAllUsers();
}
