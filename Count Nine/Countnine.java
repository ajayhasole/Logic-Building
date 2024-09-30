class Countnine{


            public static void countnine(){
				int count=1;
				for(int i=1;i<100;i++){
					int n=i;
					while(n>0){
                      int rem=i%10;
					  if(rem==9){
						  count++;
					  }
						n=n/10;
					}
					
				}
				System.out.println(count);
				
			}
  public static void main(String arg[]){
	  
	  countnine();
	  
	  
  }

}