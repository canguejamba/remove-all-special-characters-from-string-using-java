package string_dsa;

public class Remove_Special_Char {
    public static void main(String[] args) {
        String str = "@$*j!av&a@";
        String plain = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Plain text: "+plain);
    }
}

//output-:java