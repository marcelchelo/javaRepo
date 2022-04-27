import java.util.HashMap;
import java.util.LinkedList;

//WriteCode to remove duplicates from an unsorted LinkedList

public class RemoveDuplicates {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> numList = new LinkedList<Integer>();

        //hardCode a linked list of inteegers
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(6);
        numList.add(6);
        numList.add(8);
        numList.add(4);
        numList.add(3);
        numList.add(8);
     



        //System.out.println(numList);

        //initialize hashmap
        HashMap <Integer,Integer> table = new HashMap<Integer,Integer>();
       
        //iterate through the linked list 
       for(int i= 0 ; i < numList.size() ; i++){
           //if table does not contain key, add it to the table set
            if (table.containsKey(numList.get(i) ) == false  ){
                table.put(numList.get(i), 1 );     //we only care to keep tabs on the keys, do not care how many duplicates there are 
            }
            

       }
       // print only key sets 
       System.out.println(table.keySet()); 
        


        
        
    }
}
