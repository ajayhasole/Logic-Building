class Queue{
   static int rear=-1;
   static int front=-1;
    static int size;
	int arr[];
      public Queue(int size){
		   arr=new int[size];
		   this.size=size;
	  }
        public void add(int e){
			if(rear==size-1){
				System.out.println("Queue Is Overflow");
			}
			rear++;
			arr[rear]=e;
			
		}
		
		public int remove(){
			if(front==-1 && rear==-1 || front>rear){
				System.out.println("Queue Is Empty");
			}
             front++;
             int r=arr[front];
            return r;			 
		}
		
	public void display(){
		
		for(int i=0;i<=size-1;i++){
			System.out.println(arr[i]);
		}
	}	

public static void main(String arg[]){
	Queue q=new Queue(5);
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(5);
	
	q.display();
	System.out.println();
	System.out.println(q.remove());
	System.out.println(q.remove());
	//q.display();
}

}