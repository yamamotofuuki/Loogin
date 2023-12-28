package com.diworksdev.login.dto;

public class LoginDTO {
	//テーブルから取得するデータに対応したフィールド変数を宣言
	private int id;
	private String name;
	private String password;
	
	//フィールド変数に対応したgetter とsetterを定義
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//Actionから呼び出されnameフィールドの値をActionに渡す
	public String getName() {
		return name;
	}
	
	//DAOから呼び出され、引数として受け取ったテーブル値をnameフィールドに格納
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}

}








