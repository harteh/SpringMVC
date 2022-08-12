package co.sp.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sp.beans.Content;
import co.sp.dao.BoardDao;

@Service
public class MainService {

	@Autowired
	private BoardDao boardDao;
	
	public List<Content> getMainList(int board_info_idx){
		RowBounds rowBounds = new RowBounds(0, 5);
		// offset 만큼 건너띄고 limit 만큼 가져온다 
		return boardDao.getContentList(board_info_idx, rowBounds);
	}
}











