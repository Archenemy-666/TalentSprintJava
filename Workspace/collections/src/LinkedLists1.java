import java.util.*;
import java.util.List ;

public class LinkedLists1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no.of inputs");

        List list = new LinkedList();
        int length = scan.nextInt();

        for(int i = 0 ; i< length ; i++){
            System.out.println("enter element at"+i) ;
            int temp = scan.nextInt();
            list.add(temp);

        }
        System.out.println(list);


// sublist
        System.out.println("enter len if  sub list");

        List sublist = new LinkedList();
        int length2 = scan.nextInt();

        for(int i = 0 ; i< length2 ; i++){
            System.out.println("enter element at"+i) ;
            int temp2 = scan.nextInt();
            sublist.add(temp2);

        }
        System.out.println(sublist);


        System.out.println("enter the action insert or remove : ");
        String action = scan.next();

        if(action.equals("insert")){
            System.out.println("enter index : ");
            int index = scan.nextInt();
            list.add(index , sublist);

        }
        else{
            list.remove(sublist);
        }

        System.out.println(list);

    }
}