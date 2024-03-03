import java.util.LinkedList;


public class LinearProbing {

    int listgrow = 0;

    /**
     * class is the nodes for whole things
     */
    private class HashNodes{

        protected int k;
        protected int v;



        public HashNodes(int key, int value) {
            this.k = k;
            this.v = value;

        }

    }

    //Array we use throughout the code
    private HashNodes[] hashTable;


    //size
    private int hashSize = 15;

//CONSTRUCER YIPPEE
    public LinearProbing() {

        hashTable = new HashNodes[hashSize];



    }


    /**
     * Will add value to where wanted
     *
     * @param key   index in hash where it'll be placed
     * @param value what's being placed
     */
    public void insert(int key, int value) {
        //creats random number
        int pass = key % hashSize;

        //insertedIndex
        //HashNodes insertedI = hashTable[pass];


        if (hashTable[pass] != null){
            int i = 0;
            while(hashTable[pass+i] != null){
                i+=1;
                listgrow +=1;
            }

            hashTable[pass+i] = new HashNodes(key, value);

            if (listgrow == hashSize){
                //all slots full create new slots
                HashNodes[] newHash = new HashNodes[hashSize*2];
                hashTable = newHash;
            }


        } else{
            hashTable[pass] = new HashNodes(key, value);
        }

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
        HashNodes desiredI = hashTable[key % hashSize];

        if(desiredI == null){
            return 0;

        } else{
            return desiredI.v;
        }

    }



}
