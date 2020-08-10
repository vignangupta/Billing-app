
package com.onlineRetail.billing.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid Token") 
public class InvalidTokenException extends Exception {
	public InvalidTokenException() {
	}
}
