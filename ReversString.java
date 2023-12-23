package StringPractice;

public class ReversString {
    public static void main(String[] args) {
        String name = "deepak", revstring="";
        char ch;

        for(int i=0; i<name.length(); i++){
            ch = name.charAt(i);
            revstring = ch+revstring;
        }
        System.out.println(revstring);
    }
}

class A {
    A(){

    }
}
