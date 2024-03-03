import static org.junit.Assert.*;

import org.junit.*;


public class Junit4 {

    //SH = Standard Hashtable
    //LB = Linear Probing

    @Test
    public void SH_Insert(){
        System.out.println("Standard HashTable TIME!!!");

        HashFunctions SH = new HashFunctions();

        SH.insert(1, 10);
        SH.insert(3, 3);
        SH.insert(0, 1);
        SH.insert(8, 7);
        SH.insert(1, 11);

        //should be 10
        System.out.println("Should be 10: " + SH.get(1));
        assertEquals(10, SH.get(1));
        //should be 3
        System.out.println("Should be 3: " + SH.get(3));
        assertEquals(3, 3);

        SH.delete(1);
        System.out.println("Should be 11 now: " + SH.get(1));
        assertEquals(11, SH.get(1));
        //should be 11 now ^


    }

    @Test
    public void LP_Insert(){

        System.out.println("Linear Probing TIME!!!!!!");

        LinearProbing LP = new LinearProbing();

        LP.insert(0,1);
        LP.insert(1,2);


        //should be 2
        System.out.println("This should be 2: " + LP.get(1));
        assertEquals(2,LP.get(1));

        LP.insert(2,4);
        LP.insert(1,3);

        //should stay as two and index 3 should now 3
        System.out.println("This should be 2: " + LP.get(1));
        assertEquals(2,LP.get(1));
        assertEquals(3,LP.get(3));
        System.out.println("This should be 3: " + LP.get(3));

        }

}







