public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int count = 0;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void add(T data){
        Node<T> node = new Node<T>(data);

        if(tail == null){
            this.head = node;
            this.tail = node;

        } else{
            node.setPrev(tail);
            this.tail.setNext(node);
            this.tail = node;
            
        }
        count++;
    }

    public void remove(){

        if (head == null) {
            System.out.println("Nao ha elementos para remover");

        }

        else if(head == tail){
            this.head = null;
            this.tail = null;
            count--;
        }
        
        else{
            this.head = this.head.getNext();
            this.head.setPrev(null);

            count--;
        }
    }

    public void peekHead(){
        System.out.println("Head: "+this.head.getData());
    }

    public void peekTail(){
        System.out.println("Tail: "+this.tail.getData());
    }

    public int getSize() {
        return count;
    }

    public void printQueue(){

        Node<T> current = this.head;

        while(current != null){
            System.out.println(" - "+ current.getData());

            current = current.getNext();
        }
        System.out.print("\n");

    }

    public void printVehicles(){
        Node<Vehicle> current = (Node<Vehicle>) this.head;

        while(current != null){
            System.out.println(" - "+ current.getData().getDescrition());

            current = current.getNext();
        }
        System.out.print("\n");

    }
    
  
}
