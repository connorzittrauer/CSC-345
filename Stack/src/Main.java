// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String str1 = "cat", str2 = "dog", str3 = "frog";

        IStackInterface<String> stack = new ArrayBoundedStack<>();

        stack.push(str1);
        stack.push(str2);
        stack.push(str3);

        while (!stack.isEmpty()) {
            System.out.println(stack.top());
            stack.pop();
        }

    }
}