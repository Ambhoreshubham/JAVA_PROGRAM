package shubham;
import java.util.*;
public class Array_all_program {
	private static int count;
	private static int size;
	private Object system;
	public static void main(String[] args) {
     Scanner xyz=new Scanner(System.in);
    do {
    	 System.out.println("1 : jagged array");
    	 System.out.println("2 : max value ");
    	 System.out.println("3 : min value ");
    	 System.out.println("4 : second hight value ");
    	 System.out.println("5 : missing elements ");
          System.out.println("6 : desending order");
          System.out.println("7 : second hight value and remove second hight value ");
          System.out.println("8 : shorthing array ");
          System.out.println("9 : ");
          System.out.println("10 : ");

    	 int choice=xyz.nextInt();
    	 switch(choice) {
    	 case 1:
    		 int a[][]=new int[3][];
    		 a[0]=new int[3];
    		 a[1]=new int[4];
    		 a[2]=new int[2];
    		 System.out.println("Enter the number");
    		 for(int i=0;i<a.length;i++) {
    			 for(int j=0;j<a[i].length;j++) {
    				 a[i][j]=xyz.nextInt();
    			 }
    		 }
    		 System.out.println("Display the matrix");
    		 for(int i=0;i<a.length;i++) {
    			 for(int j=0;j<a[i].length;j++) {
    				 System.out.printf("%d\t",a[i][j]);
    			 }
			 	 System.out.printf("\n");
    		 }
    		 break;
    	 case 2:
    		 int a1[]=new int [5];
    		 System.out.println("Enter the number");
    		 for(int i=0;i<a1.length;i++) {
    			 a1[i]=xyz.nextInt();
    		 }
    		 int max=a1[0];
    		 for(int i=0;i<a1.length;i++) {
    			 if(a1[i]>max) {
    				 max=a1[i];
    			 }
    		 }
    		 System.out.printf("maximum value is %d\n",max);
    		 break;
    	 case 3:
    		 int a11[]=new int[5];
    		 System.out.println("Enter the number");
    		 for(int i=0;i<a11.length;i++)
    		 {
    			 a11[i]=xyz.nextInt();
    		 }
    		 int min=a11[0];
    		 for(int i=0;i<a11.length;i++) {
    			 if(a11[i]>min)
    			 {
    				 min=a11[i];
    			 }
    		 }
    		 System.out.printf("minmum value is %d\n",min);
    		 break;
    	 case 4:
    		 int temp;
    		 int a111[]=new int[5];
    		 System.out.println("Enter the value");
    		 for(int i=0;i<a111.length;i++) {
    			 a111[i]=xyz.nextInt();
    		 }
    		 System.out.println("display the value");
    		 for(int i=0;i<a111.length;i++)
    		 {
    			 System.out.println(a111[i]+"\t");
    		 }
    		 for(int i=0;i<a111.length;i++) {
        		 for(int j=(i+1);j<a111.length;j++) {
        			 temp=a111[i];
        			 a111[i]=a111[j];
        			 a111[j]=temp;
        		 }
        		 System.out.println("before sorting the value");
        		 {
        			 System.out.println(a111[i]+"\t");
        		 }
 
        			count=0;
        			for(int i1=0;i1<5;i1++)
        			{
        				int large = 0;
						if(a111[i1]==large)
        				{
        					++count;
        				}
        			}
        			System.out.printf("\nsecond higest element is %d",a111[(size-count)-1]);

    		 }

    		 break;
    	 case 5:
    		 int n;
    		 System.out.println("Enter the total number of elemtent");
    		 n=xyz.nextInt();
    		 int a32[]= new int[n];
    		 System.out.println("Enter the elements of the array");
    		 for(int i=0;i<5;i++)
    		   {
    		 a32[i]=xyz.nextInt();
    		 }
    		 for(int i=0;i<5;i++)
    		 {
    		  for(int j=a32[i];j<(a32[i+1]-1);) {
    			  System.out.printf("%d\n",++j);
    		  }
    		 }
    		 break;
    	 case 6:
    		 int a11111[]=new int[5];
    		   System.out.println("Enter the five value in array");
    		   {
    		     for(int i=0;i<a11111.length;i++)
    		      {
    		        a11111[i]=xyz.nextInt();
    		      }
    		         for(int i=0;i<a11111.length;i++)
    		          {
    		            for(int j=0;j<a11111.length;j++)
    		             {
    		                if(a11111[i]<a11111[j])
    		                 {
    		                   int temp1=a11111[i];
    		                   a11111[i]=a11111[j];
    		                   a11111[j]=temp1;
    		                }
    		           }
    		       }
    		System.out.println("array is a descending order");
    		for(int i=0;i<a11111.length;i++)
    		{
    		  System.out.printf("\n%d",a11111[i]);
    		}
    		}
    		
    		 break;
    	 case 7:
    		// Java program to Remove One Array From Another Array

    		 		// creating first array
    		 		List<Integer> firstList = new ArrayList<>();

    		 		// creating second array
    		 		List<Integer> secondList = new ArrayList<>();

    		 		// adding elements in first array
    		 		firstList.add(100);
    		 		firstList.add(200);
    		 		firstList.add(300);
    		 		firstList.add(400);
    		 		firstList.add(500);
    		 		firstList.add(600);

    		 		// adding elements in second array
    		 		secondList.add(500);
    		 		
    		 		// displaying element of first array
    		 		System.out.println("elements in first array "
    		 						+ firstList);
    		 		
    		 		// displaying element of second array
    		 		System.out.println("elements in second array "
    		 						+ secondList);
    		 		
    		 		// removing elements from firstarray
    		 		firstList.removeAll(secondList);

    		 		// displaying elements of first array
    		 		// after removing elements of second array
    		 		// from first array
    		 		System.out.println("first array after removing second array from first array\n"
    		 			+ firstList);

    	 break;
    	 case 8:
    		 int c[]=new int[5];
    		 System.out.println("Enter the array");
    		 for(int i=0;i<c.length;i++)
    		 {
    			 c[i]=xyz.nextInt();
    		 }
             	for(int i=0;i<c.length;i++)
             	{
                 	for(int j=0;j<c.length;j++) {
                 		if(c[i]<c[j])
                 		{
                 			temp=c[i];
                 			c[i]=c[j];
                 			c[j]=temp;
                 		}
                 	}

             	}
             	System.out.println("sorthing the array");
             	{
                 	for(int i=0;i<c.length;i++) {
                 		System.out.printf("%d\n",c[i]);
                 	}
             	}
    		 break;
    	 }
    	 }while(true);
    }
}