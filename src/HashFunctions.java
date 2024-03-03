import java.util.LinkedList;

public class HashFunctions{

//private class to be nodes class
    private class HashNodes{

        protected int k;
        protected int v;

        public HashNodes(int key, int value) {
            this.k = k;
            this.v = value;

        }

    }

    //size
    private final int hashSize = 10;


    //makes linked list array
    private LinkedList<Integer>[] hashTable;



    //Constructor for hash table
    public HashFunctions() {

        hashTable = new LinkedList[hashSize];

        for(int i =0; i< hashSize; i++){
            hashTable[i] = new LinkedList<>();
        }

    }



    /**
     * Will add value to where wanted
     * If there's a value in an index, then it will add it to linked list
     * @param key   index in hash where it'll be placed
     * @param value what's being placed
     */
    public void insert(int key, int value) {
        //hashpass to make a passcode type indexes
        int pass = key % 10;



        hashTable[pass].add(value);

    }


    /**
     * Get function that works similarly to linked lists get.
     *
     * @param key
     * @return should return value within key.
     */
    public int get(int key) {
        //use same thing from insert for password to grab index
        //desired index
        LinkedList desiredI = hashTable[key % 10];

        //if nothing is in key
        if (desiredI.isEmpty()) {
            return 0;
        } else {
            return (int) desiredI.get(0);

        }

    }

    /**
     * Will delete a value from an index
     * if there's a value inside it, then it'll input the next in line form LinkedList
     * @param key index
     * @return removed value
     */
    public int delete(int key) {
        LinkedList desiredI = hashTable[key % 10];

        if (desiredI.isEmpty()){
            return 0;
        } else{
            return (int) desiredI.remove(0);
        }


    }

}





