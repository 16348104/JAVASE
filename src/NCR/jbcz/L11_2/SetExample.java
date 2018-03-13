package NCR.jbcz.L11_2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zb on 2018/3/12.
 */
public class SetExample {
    public static void main(String[] args) {
        int numArgs = args.length;
        Set encountered = new HashSet();
        for (int i = 0; i < numArgs; i++) {
            String argument = args[i];
            Set characters = new HashSet();
            int size = argument.length();
            for (int j=0;j<size;j++) {
                characters.add(new Character(argument.charAt(j)));
            }
            Set commonSubset = new HashSet(encountered);
            commonSubset.retainAll(characters);
            boolean areDisjunc = commonSubset.size() == 0;
            if (areDisjunc) {
                System.out.println(characters+"和"+encountered+"是分离的。");
            } else {
                //
                boolean isSubset = encountered.containsAll(characters);
                boolean isSuperset = characters.containsAll(encountered);
                if (isSubset&&isSuperset) {
                    System.out.println(characters+"是相同于"+encountered);
                } else if (isSubset) {
                    System.out.println(characters+"的父集是"+encountered);
                } else if (isSuperset) {
                    System.out.println(characters+"的子集是"+encountered);
                }else {
                    System.out.println(characters+"和"+encountered+"的公共子集是"+commonSubset);
                }
            }
            encountered.addAll(characters);
        }
    }
}