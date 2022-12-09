package Number3;

public class Number3 {
    public static void main(String[] args){
        hashtab tab = new hashtab();
        tab.hashtabInit();
        tab.hashtabAdd(1.2f,"a");
        tab.hashtabAdd(3.4f,"b");
        tab.hashtabAdd(5.6f,"c");
        tab.hashtabAdd(7.85f,"d");
        tab.hashtabAdd(10.9f,"e");
        tab.hashtabAdd(11.12f,"f");
        tab.hashtabAdd(13.14f,"g");
        tab.hashtabAdd(15.16f,"h");
        tab.hashtabAdd(17.18f,"i");
        tab.hashtabAdd(19.19f,"j");
        System.out.println(tab.hashtabLookUp(17.18f));
    }
}
