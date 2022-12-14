package co.sp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import co.sp.beans.Content;

//SQL를 호출하기 위한 매퍼 인터페이스
public interface BoardMapper {
	
	@SelectKey(statement = "select content_seq.nextval from dual", keyProperty = "content_idx", before = true, resultType = int.class)
	//content_idx 에 세팅한다
	//BEFORE로 설정하면 키를 먼저 조회하고 그 값을 keyProperty 에 셋팅한 뒤 insert 구문을 실행한다
	//SelectKey를 dual에서 추출
	
	
	@Insert("insert into content_table(content_idx, content_subject, content_text, " +
			"content_writer_idx, content_board_idx, content_date) " +
			"values (#{content_idx}, #{content_subject}, #{content_text}, #{content_writer_idx}, #{content_board_idx}, sysdate)")
	void addContentInfo(Content writeContentBean);
	
	@Select("select board_info_name " + 
			"from board_info_table " + 
			"where board_info_idx = #{board_info_idx}")
	String getBoardInfoName(int board_info_idx);
	
	@Select("select a1.content_idx, a1.content_subject, a2.user_name as content_writer_name, " + 
			"       to_char(a1.content_date, 'YYYY-MM-DD') as content_date " + 
			"from content_table a1, user_table a2 " + 
			"where a1.content_writer_idx = a2.user_idx " + 
			"      and a1.content_board_idx = #{board_info_idx} " + 
			"order by a1.content_idx desc")
	List<Content> getContentList(int board_info_idx, RowBounds rowBounds);
	
	@Select("select a2.user_name as content_writer_name, " + 
			"       to_char(a1.content_date, 'YYYY-MM-DD') as content_date, " + 
			"       a1.content_subject, a1.content_text, a1.content_writer_idx " + 
			"from content_table a1, user_table a2 " + 
			"where a1.content_writer_idx = a2.user_idx " + 
			"      and content_idx = #{content_idx}")
	Content getContentInfo(int content_idx);
	
	@Update("update content_table " +
			"set content_subject = #{content_subject}, content_text = #{content_text} where content_idx = #{content_idx}")
	void modifyContentInfo(Content modifyContentBean);
	
	@Delete("delete from content_table where content_idx = #{content_idx}")
	void deleteContentInfo(int content_idx);
	
	@Select("select count(*) from content_table where content_board_idx = #{content_board_idx}")
	int getContentCnt(int content_board_idx);
} 


















