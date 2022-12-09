public class ilLegalAdress extends Error{
    public ilLegalAdress(String adress){
        super("There is no such adress " + adress + "");
    }
}
