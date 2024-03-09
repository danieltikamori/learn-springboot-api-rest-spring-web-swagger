package cc.tkmr.learnspringbootapirestspringwebswagger.handler;

public class RequiredFieldException extends BusinessException {
    public RequiredFieldException(String fieldName) {
        super("The field %s is required", fieldName);
    }
}
