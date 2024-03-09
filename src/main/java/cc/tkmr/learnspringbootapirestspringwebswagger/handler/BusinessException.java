package cc.tkmr.learnspringbootapirestspringwebswagger.handler;

public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String message, Object ... params){
        super(String.format(message, params));
    }
//    public BusinessException(String message, Throwable cause){
//        super(message, cause);
//    }

}
