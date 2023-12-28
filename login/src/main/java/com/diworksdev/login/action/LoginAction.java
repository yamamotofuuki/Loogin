package com.diworksdev.login.action;
import java.sql.SQLException;

import com.diworksdev.login.dao.LoginDAO;
import com.diworksdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	//必ずJSPでの定義と同じ名前
	private String name;
	private String password;
	
	public String execute() throws SQLException{
		String ret = ERROR;
		
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		
		dto = dao.select(name,password);
		
		//条件を満たした場合、戻り値「ret」の内容をSUCCESSに書き換え
		if(name.equals(dto.getName())) {
			if(password.equals(dto.getPassword())){
			ret = SUCCESS ;
			}
		} 
		
		return ret;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
