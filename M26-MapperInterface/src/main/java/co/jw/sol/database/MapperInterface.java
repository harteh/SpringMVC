package co.jw.sol.database;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import co.jw.sol.beans.Data;

public interface MapperInterface {
	
	@Insert("insert into mvc(d1, d2, d3) values(#{d1}, #{d2}, #{d3})")
	void in_sert(Data data);
	
	@Select("select d1,d2,d3 from mvc")
	List<Data> sel();

}
