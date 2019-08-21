
    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        Node(int d, Node next)
        {
            data = d;
            next = null;
        }
        public static void main(String[] args) {

        Node node = new Node(1,null);
        System.out.println(node.data);
    }
}