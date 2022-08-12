package co.sp.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sp.beans.User;
import co.sp.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Resource(name = "loginBean")
	private User loginBean;
	
	public boolean checkuserIdExist(String user_id) {
		//user_id 매개 변수로 해서 아이디 중복 검사
		String user_name = userDao.checkUserIdExist(user_id);
		
		if(user_name == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addUserInfo(User joinUserBean) {
		userDao.addUserInfo(joinUserBean);
	}
	
	public void getLoginUserInfo(User tempLoginUserBean) {
		//로그인 화면에서 입력한 아이디와 비밀번호가 
		//회원테이블에 저장한 아이디와 비번이 일치하면 로그인 되게 하는 메서드
		User tempLoginUserBean2 = userDao.getLoginUserInfo(tempLoginUserBean);
		
		if(tempLoginUserBean2 != null) {
			//userMapper.getLoginUserInfo 에서 아이디와 비번으로 검색 결과가 있다면
			loginBean.setUser_idx(tempLoginUserBean2.getUser_idx());
			loginBean.setUser_name(tempLoginUserBean2.getUser_name());
			loginBean.setUserLogin(true);
			//tempLoginUserBean2에 유저의 인덱스와 이름, 로그인 여부를 
			//LoginInterceptor에 의해 User 타입으로 저장한다 = 로그인한 사용자
		}
	}
	
	public void getModifyUserInfo(User modifyUserBean) {
		User tempModifyUserBean = userDao.getModifyUserInfo(loginBean.getUser_idx());
		
		modifyUserBean.setUser_id(tempModifyUserBean.getUser_id());
		modifyUserBean.setUser_name(tempModifyUserBean.getUser_name());
		modifyUserBean.setUser_idx(loginBean.getUser_idx());
	}
	
	public void modifyUserInfo(User modifyUserBean) {
		
		modifyUserBean.setUser_idx(loginBean.getUser_idx());
		
		userDao.modifyUserInfo(modifyUserBean);
	}
}











