package org.example;

public class Main {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();
        tree.put(1, "a");
        tree.put(2, "b");
        tree.put(3, "c");
        tree.put(4, "d");
        tree.put(5, "e");
        tree.put(6, "f");
        tree.put(7, "g");
        tree.put(8, "h");

        System.out.println(tree.get(1));
        System.out.println(tree.get(2));

        tree.delete(1);

        System.out.println(tree.get(1));

        System.out.println(tree.size());

        for(var node : tree) {
            System.out.println(node.key + " " + node.val);
        }

    }
}