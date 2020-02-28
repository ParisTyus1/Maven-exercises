import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils {

//    String actual = ((StringUtils.reverse("The apple dont fall far from the tree")));


    public static void main(String[] args) {
        boolean revesrseString = (StringUtils.isNumeric("Apple"));
        System.out.println("hi");
        System.out.println(StringUtils.swapCase("The dog has a BONE"));

    }






//    public static String reverseCase(String text){
//
//        char[] chars = text.toCharArray();
//        for (int i = 0; i < chars.length; i++)
//        {
//            char c = chars[i];
//            if (Character.isUpperCase(c))
//            {
//                chars[i] = Character.toLowerCase(c);
//            }
//            else if (Character.isLowerCase(c))
//            {
//                chars[i] = Character.toUpperCase(c);
//            }
//        }
//        return new String(chars);
//    }

//        public static String swapCase(String str){
//
//            StringUtils.swapCase(null) = null;
//            StringUtils.swapCase("") = "";

//
//        }

}
