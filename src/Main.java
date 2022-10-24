import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(method("Ata", "Apa"));


    }
    public static String[]  method(String ... arrey){

        for (String name:arrey) {
            System.out.println(name + " men seni jakshy korom!");
        }
        return null;
    }
}
//System.out.println(word.charAt(3));//indextegi simvoldu kaitarat
//        System.out.println(word.substring(0, 3));//saptyn bir bolugun kesip kaitarat
//        System.out.println(word.substring(2));
//        System.out.println(word.contains("J"));//soz kamtylganby jokpu teksheret
//        System.out.println(word.toUpperCase());//chon tamga mn chygarat
//        System.out.println(word.toLowerCase());//kichine tamga mn chygarat
//        System.out.println(word.trim());//ashykcha probelderdi jok kylat
//        System.out.println(word.equals("java"));//barabar je barabar emes ekenin teksheret
//        System.out.println(word.replace("Java", "JavaScript"));//sozdu ozgortot
//        System.out.println(word.length());//sozdun razmerin chygaryp beret
//        System.out.println(word.concat(" Java-7 "));//eki sozdu biriktiret