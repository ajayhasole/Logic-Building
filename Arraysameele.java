class Arraysameele{
public static void max(int a1[],int a2[],int l1,int l2){
int i=0,j=0;

   while (i < l1 && j < l2) {
            if (a1[i] == a2[j]) {
                System.out.println(a1[i]);
                i++;
                j++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else {
                j++;
            }
        }

}

public static void main(String arg[]){

     int a1[]={1,2,3,4};
	 int a2[]={2,4,5,6};
	 max(a1,a2,4,4);
}
}