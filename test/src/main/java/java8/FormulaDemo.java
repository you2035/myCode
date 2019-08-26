package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FormulaDemo implements Formula {
    @Override
    public double calculate(int a) {
        return  sqrt(a * 100);
    }

    public static void main(String[] args) {
        FormulaDemo formulaDemo = new FormulaDemo();
        System.out.println(formulaDemo.calculate(100));;
        System.out.println(formulaDemo.sqrt(16));

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
//                Collections.sort(names, new Comparator<String>() {
//                    @Override
//                    public int compare(String a, String b) {
//                        return a.compareTo(b);
//                    }
//                });

                Collections.sort(names,(a,b)-> a.compareTo(b));
        for (String name : names) {
            System.out.print(name+" ");
        }
    }

}
