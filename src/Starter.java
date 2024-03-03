
public class Starter {



    public static void main(String[] args) {

        HashFunctions ht = new HashFunctions();

        LinearProbing lp = new LinearProbing();

        ht.insert(1,2);
        ht.insert(1, 3);
        ht.insert(10, 5);


        System.out.println(ht.get(10));
        System.out.println(ht.delete(1));
        System.out.println(ht.get(1));


        lp.insert(0, 10);
        lp.insert(1, 5);

        lp.insert(2, 90);
        lp.insert(1, 11);

        System.out.println(lp.get(3));
        System.out.println(lp.get(1));
















    }
}
