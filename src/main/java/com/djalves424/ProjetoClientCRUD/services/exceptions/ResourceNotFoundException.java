package com.djalves424.ProjetoClientCRUD.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String msg) {
        super(msg);

    }
}
