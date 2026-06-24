import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args){

        // Declaring array list
        List<String> studentsName = new ArrayList<>();
        // size = n
        //        n + n/2 + 1

        // adding elements
        studentsName.add("Rakesh");
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // printing array list
        System.out.println(list);

        list.add(4);
        // adding at specific index
        list.add(1, 50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        // adding a new array list to existing an existing array list
        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);

        // Changing the value at an index in the array list
        list1.set(2, 1000);
        System.out.println(list1);

        //checking if an element is present in the array list
        System.out.println(list.contains(50));
        
        // Iterating through the array list
        // using for loop
        for(int i=0; i<list.size(); i++){
            System.out.println("the element is " + list1.get(i));
        }
        // using for each loop
        for(Integer element: list) {
            System.out.println("foreach element is " + element);
        }
        // using iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator" + it.next());
        }


        System.out.println(list1);
        // removing elements from array list using index
        list1.remove(1);
        System.out.println(list1);

        // removing elements from array list using the element
        list1.remove(Integer.valueOf(1000));
        System.out.println(list1);

        // removing all the elements from the list
        list1.clear();
        System.out.println(list1);


    }
}
