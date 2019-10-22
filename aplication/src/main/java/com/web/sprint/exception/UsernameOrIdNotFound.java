package com.web.sprint.exception;

public class UsernameOrIdNotFound extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2185439962607183224L;

	public UsernameOrIdNotFound () {
		super ("usuario o Id no encontrado");
	}
	
	public UsernameOrIdNotFound (String message) {
		super (message);
	}
	
	
}
