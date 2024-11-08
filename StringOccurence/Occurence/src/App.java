public class App {
    public static void main(String[] args) {
        String original = "String Reversal";
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}
