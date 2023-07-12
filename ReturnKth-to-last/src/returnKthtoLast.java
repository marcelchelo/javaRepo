//get the kth element of a singly linked list

import java.util.LinkedList;
import java.util.List;

public class returnKthtoLast {
    public static void main(String[] args) throws Exception {
       LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i=1 ; i<= 100; i++){
            list.add(i);
        }

     
        

        System.out.println(getKthToLastElement(2, list));
       
    }

    private static int getKthToLastElement(int kthToLast, LinkedList<Integer> list) {
        int jumps = list.size() - kthToLast;
        int i = list.get(jumps);
       
        return i;

        
    }

   
}
