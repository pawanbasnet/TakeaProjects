
public class Addition {
    public static void main(String[] args) {
        int fno = 100;
        int result = 0;
        try {
            result = fno/0;
        System.out.println("Divided by Zero!");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
           System.out.println(e);
           System.out.println("Arithmetic Exception Handled");
        }
        System.out.println("Hello world");
    }

}