package javaBase;

/**
 * @Auther: liuxin
 * @Date: 2019/7/1 09:13
 * @Description:
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer j = new Integer(123);
        Integer i = new Integer(123);
        System.out.println(i==j);

        int i1 =  Integer.valueOf(11222);
        int j1 = Integer.valueOf(11222);
        System.out.println(i1==j1);

        Integer m = 12334;
        Integer n = 12334;
        System.out.println(m == n);


    }
}
