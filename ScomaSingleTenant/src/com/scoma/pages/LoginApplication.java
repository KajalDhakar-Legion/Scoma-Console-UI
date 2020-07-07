package com.scoma.pages;

public interface LoginApplication {
	public void login(String org,String emailAddress, String password) throws Exception;
	public void googleSignIn() throws Exception;
}
