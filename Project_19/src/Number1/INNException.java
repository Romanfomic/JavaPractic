package Number1;

public class INNException extends Exception{
    public INNException(){
        super("\nДанный INN не действителен!\n");
    }
}
