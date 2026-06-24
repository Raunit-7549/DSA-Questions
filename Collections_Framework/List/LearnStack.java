import java.util.Stack;

public class LearnStack{
    public static void main(String[] args){
        // Stack follows last in first out
        // Declaring a Stack
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        // printing a stack
        System.out.println("Stack: " + animals);

        // checking the element at the top in the stack
        System.out.println(animals.peek());

        // removing the element from the top of the stack
        animals.pop();
        System.out.println(animals.peek());
    }
}