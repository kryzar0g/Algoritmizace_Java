import java.util.Stack;

public class stack {
    public static void main(String args[]){
        Stack<Character> stack = new Stack<>();
        String text = "joha";
        char[] ahoj = text.toCharArray();

        for (int i=0;i<ahoj.length;i++){
            stack.push(ahoj[i]);
        }
        for (int i=0;i<ahoj.length;i++){
            System.out.print(stack.pop());
        }

        

    }
    
}
