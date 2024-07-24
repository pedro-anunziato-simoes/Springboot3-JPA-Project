package com.ProjetoSpring.CursoSpring.services.exceptions;

public class ResourcesNotFoundExecption extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourcesNotFoundExecption(Object id) {
		super("Resouce not found. Id "+ id);
	}

}
