package com.devsenior2.modulo_3.clase4;

public class DivisionInvalidaException extends RuntimeException { //Heredamos esta clase para que sea unchecked.

    public DivisionInvalidaException(String message){
        super(message);
    }


}
