package com.devsuperior.dscatalog.services.exception;

public class EntityNotFoundException extends RuntimeException{
   public EntityNotFoundException(String message){
       super(message);
   }
}