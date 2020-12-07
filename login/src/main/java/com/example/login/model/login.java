package com.example.login.model;

public class login {
private long num;
private String id;
private String pw;
private String name;




public login(long num, String id, String pw, String name) {
	super();
	this.num = num;
	this.id = id;
	this.pw = pw;
	this.name = name;
}






public long getNum() {
	return num;
}






public void setNum(long num) {
	this.num = num;
}






public String getId() {
	return id;
}






public void setId(String id) {
	this.id = id;
}






public String getPw() {
	return pw;
}






public void setPw(String pw) {
	this.pw = pw;
}






public String getName() {
	return name;
}






public void setName(String name) {
	this.name = name;
}






public login() {
	super();
}






public login(String string, String string2) {
	// TODO Auto-generated constructor stub
}



}
