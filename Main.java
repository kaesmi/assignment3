public class Main {
    public static void main(String[] args){
        BST<Integer, String> tree = new BST<>();
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");
        tree.put(2, "two");
        tree.put(4, "four");

        for(BST.BSTEntry elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        int keyToCheck1 = 4;
        int keyToCheck2 = 9;

        boolean key1Exists = tree.consist(keyToCheck1);
        boolean key2Exists = tree.consist(keyToCheck2);

        System.out.println("Key " + keyToCheck1 + " exists in the BST: " + key1Exists);
        System.out.println("Key " + keyToCheck2 + " exists in the BST: " + key2Exists);
    }
}
