package Assignment6;
import java.util.*;
public class Rotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(findRotation(s1,s2));
    }
    static boolean findRotation(String s1 , String s2){
       String combine = s1 + s2;
        return combine.contains(s1);
    }
}
