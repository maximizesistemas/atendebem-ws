package com.maximizesistemas.atendebemws.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
    public ResourceNotFoundException(Object id) { //objeto que tentou encontrar
    	super("Resource not found. Id: " + id);
    }

}
