class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
    }
}

public class StackUsingLL {


    StackNode top;
    StackNode head ;


    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else
            return false;
    }

    public boolean push(int data) {
        StackNode newNode = new StackNode(data);

        if (isEmpty()) {
            top = newNode;
        }
        else {
            StackNode temp = top;
            top = newNode;
            newNode.next = temp;
        }
        return true;
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (top == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }


    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return top.data;
        }
    }



    /*  Function to display the status of the stack */
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            System.exit(1);
        }
        else {
            StackNode temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.next;
            }
        }
    }


    public static void main(String[] args) {
        StackUsingLL stackUsingLL = new StackUsingLL();
        stackUsingLL.push(100);
        stackUsingLL.push(90);
        stackUsingLL.push(80);

        stackUsingLL.push(70);
        stackUsingLL.pop();

        System.out.println(stackUsingLL.peek());
        stackUsingLL.display();}


}
