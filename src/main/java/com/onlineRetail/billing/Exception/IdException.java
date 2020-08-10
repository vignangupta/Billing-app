
package com.onlineRetail.billing.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Id") 
public class IdException extends RuntimeException {
public IdException(Integer id) {
	System.out.println("Sorry ! The Product Code "+id+" is not available.");
}
public IdException(String s) {
	System.out.println(s);	
}
}
