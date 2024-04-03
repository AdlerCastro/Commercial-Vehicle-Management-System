public class Stack<T> {
    private Node<Vehicle> head;
    private int count = 0;

    public Stack() {
        this.head = null;
    }

    public void push(Vehicle vehicle){
        Node<Vehicle> node = new Node<Vehicle>(vehicle);

        if(head == null){
            this.head = node;

        } else{
            node.setNext(this.head);
            this.head = node;
            count++;
        }
    }
    
    public void pop(){
        if(this.head == null){
            return;
            
        }
        
        Node<Vehicle> node = this.head;
        this.head = this.head.getNext();
        node.setNext(null);
        count--;
    }
    
    public void peek(){
        Node<Vehicle> current = this.head;
    
        if (this.head == null) {
            System.out.println("A lista está vazia");
    
        } else {
            System.out.println(current.getData());
        }
    }

}
