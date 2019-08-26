package java8.FunctionalInterface;

public class ConverterDemo {
    public static void main(String[] args) {
        Converter<String,Integer> converter = Integer::valueOf;
        Integer i = converter.convert("123");
        System.out.println(i);

        SomeThing someThing = new SomeThing();
        Converter<String,String> converter1 = someThing::doSomeThing;
        String s = converter1.convert("java");
        System.out.println(s);

    }

    static class SomeThing{
        String doSomeThing(String s){
            return String.valueOf(s.charAt(0));
        }
    }


}
