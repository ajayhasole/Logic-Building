
class Circlurqueue{

public static int arr[];
public static int rear=-1;
public static int front=0;
public static int size;
 
 public Circlurqueue(int size){
	 arr=new int[size];
	 this.size=size;
 }
public static boolean isEmpty(){
	
	return front==rear+1%size;
}
public static boolean isFull(){
	
	return front==(rear+2)%size;
}
   public void add(int e){
	   if(isFull()){
		   System.out.println("Queue Is Overflow");
	   }
	   rear=rear+1%size;
	   arr[rear]=e;
   }
   public int remove(){
	   
	   if(isEmpty()){
		   System.out.println("Queue Is Underflow");
		   return -1;
	   }
	   	   int r=arr[front];

	   front=front+1%size;
	   return r;
   }

 public void display(){
	 for(int i=0;i<=size-1;i++){
		 System.out.println(arr[i]);
	 }
	 
 }

public static void main(String arg[]){
	Circlurqueue cq= new Circlurqueue(5);
	cq.add(10);
	cq.add(20);
	cq.add(30);
	cq.add(40);
    cq.add(50);
	cq.display();
	System.out.println(cq.remove());
	System.out.println(cq.remove());
	System.out.println(cq.remove());
	System.out.println(cq.remove());
    System.out.println(cq.remove());
	System.out.println(cq.remove());


}
}
/*
class Circlurqueue {

    private int arr[];
    private int rear;
    private int front;
    private int size;

    public Circlurqueue(int size) {
        arr = new int[size];
        this.size = size;
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == (rear + 1) % size;
    }

    public boolean isFull() {
        return front == (rear + 2) % size;
    }

    public void add(int e) {
        if (isFull()) {
            System.out.println("Queue Is Overflow");
            return;
        }
        rear = (rear + 1) % size;
        arr[rear] = e;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue Is Underflow");
            return -1; // Return a sentinel value or throw an exception if desired
        }
        int value = arr[front];
        front = (front + 1) % size;
        return value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Circlurqueue cq = new Circlurqueue(5);
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        cq.display();
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove()); // This should print "Queue Is Underflow" and return -1
    }
}
*/