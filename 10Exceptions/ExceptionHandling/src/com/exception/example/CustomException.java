package com.exception.example;

class TooYounException extends RuntimeException{
    public TooYounException(String message){
        super(message);
    }
}

class TooOldException extends RuntimeException{
    public TooOldException(String s){
        super(s);
    }
}

class CustomException {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age > 60){
            throw new TooOldException("Age is over the limit");
        }
        else if (age < 18){
            throw new TooYounException("Age is too young");
        }
        System.out.println("Thanks for register");
    }

}
