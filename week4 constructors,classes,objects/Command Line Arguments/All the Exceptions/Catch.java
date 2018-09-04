public class Catch {
    
    public static void main(String [] args) {
        try {
            Broken broke = new Broken();

            System.out.println("Testing");
            broke.cracked();
            
        } catch(ArrayIndexOutOfBoundsException caught) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Finally");
                
        } catch(NullPointerException caught) {
            System.out.println("NullPointerException");
            System.out.println("Finally");
            
        } catch(ArithmeticException caught) {
            System.out.println("ArithmeticException");
            System.out.println("Finally");
        }
    }
}