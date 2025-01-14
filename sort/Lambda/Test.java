package sort.Lambda;

public class Test {

    public static void main(String[] args) {

        Printer p = (num1, num2) -> num1 + num2;

        int valu = p.display(2, 4);
        System.out.println(valu);

    }

}
