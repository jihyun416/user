package com.jessy.user.exception;

public class AuthenticationEntryPointException extends RuntimeException {
    public AuthenticationEntryPointException(String msg, Throwable t) {
        super(msg, t);
    }
    public AuthenticationEntryPointException(String msg) {
        super(msg);
    }
    public AuthenticationEntryPointException() {
        super();
    }
}
