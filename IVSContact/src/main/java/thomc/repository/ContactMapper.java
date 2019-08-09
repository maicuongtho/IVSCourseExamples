package thomc.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import thomc.entity.Contact;


public interface ContactMapper {
	   
	    @Insert("insert into contact(name,email, phone) values(#{name},#{email},#{phone})")
	    void insertContact(Contact contact);
	    
	    @Select("select * from Contact WHERE id=#{id}")
	    Contact getContactById(Integer id);
	    
	    @Select("select * from Contact")
	    List<Contact> getAllContact();
	    
	    @Delete("delete from Contact where id=#{id}")
	    void deleteContact(Integer id);
	    
	    @Update("update Contact set name=#{name}, email=#{email}, phone=#{phone}")
	    void updateContact(Contact contact);
	    
	    @Select("select * from Contact where name like CONCAT('%', #{term}, '%')")
	    List<Contact> findByNameContaining(String term);
}
