 package shubham;
import java.util.*;
public class ALLprogram {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      do {
    	  System.out.println("\n1 : \nTwo number addition");
    	  System.out.println("2 : Two number addition");
    	  System.out.println("3 : calculate the power");
    	  System.out.println("4 : sum of the number");
    	  System.out.println("5 :fibonacci series");
    	  System.out.println("6 : Three digits reverse");
    	  System.out.println("7 : Pattern print");
    	  System.out.println("8 : swapping the two number");
    	  System.out.println("9 : six subject marks");
    	  System.out.println("10 : digits count");
    	  System.out.println("11 : Table is");
    	  System.out.println("12 : Number is factorial");
    	  System.out.println("13 : Number is palindrom or not palindrom");
    	  System.out.println("14 : number is perfect or no perfect");
    	  System.out.println("15 : Number is prime or not prime");
          System.out.println("16 : Number is amstrong and not amstrong");
          System.out.println("17 : factrioal number");
         int choice=xyz.nextInt();
         switch(choice) {
         case 1:
        	 System.out.println("Enter the number");
        	 int a=100,b=200,c;
        	 c=a+b;
        	 System.out.printf("Addition is %d\n",c);
        	 break;
         case 2:
        	 System.out.println("Enter the number");
        	 a=xyz.nextInt();
        	 b=xyz.nextInt();
        	 c=a+b;
        	 System.out.printf("Addition is %d\n",c);
        	 break;
         case 3:
        	 int base,index,p = 1;
        	 System.out.println("Enter the base and index");
        	 base=xyz.nextInt();
        	 index=xyz.nextInt();
        	 for(int i=1;i<=index;i++)
        	 {
        		 p=p*base;
        	 }
        	 System.out.printf("Power is %d",p);
        	 break;
         case 4:
        	 System.out.println("Enter the number");
             int no=xyz.nextInt();
             int sum=0;
             for(int i=1;i<=no;i++) {
           	
           	  sum=sum+i;
             }
            System.out.printf("digits count is %d",sum);
        	 break;
         case 5:
        	 int f1=0,f2=1,fib = 0,limit=0;
        	 System.out.println("Enter the limit");
        	 limit=xyz.nextInt();
        	    for(int i=0;i<=10;i++) {
        	    	fib=f1+f2;
        	    	f1=f2;
        	    	f2=fib;
        	    System.out.printf("fibonolonce series=%d\n",fib);
        	    }
           	

        	 break;
         case 6:
        	 int r=0;
        	 System.out.println("Enter the number");
        	 int no1=xyz.nextInt();
        	 while(no1!=0)
        	 {
               int rem=no1%10;
                  no1=no1/10;
                  r=r*10+rem;
        	 }
        	 System.out.println("reverse is"+r);
        	 break;
         case 7:
        	 for(int i=1;i<=5;i++) {
        		 for(int j=1;j<=5;j++) {
        			 if(i<=j) {
        				 
        				 System.out.printf("*",i);
        			 }
        			 System.out.println();
        		 }
        	 }
        	 break;
         case 8:
        	 int a1,b1,c1;
        	 System.out.println("Enter the two number");
        	 a1=xyz.nextInt();
        	 b1=xyz.nextInt();
        	 c1=xyz.nextInt();
        	 System.out.println("Before swapping\n");
        	 System.out.printf("a1=%d\tb1=%d\n",a1,b1);
              a=a1+b1;
              b=a1-b1;
              a=a1-b1;
         	 System.out.printf("After swapping\n");
        	 System.out.printf("a=%d\tb=%d\n",a1,b1);
        	 break;
         case 9:
        	 int s1,s2,s3,s4,s5,s6,agg,per;
        	 System.out.println("Enter the subject marks");
        	 s1=xyz.nextInt();
        	 s2=xyz.nextInt();
        	 s3=xyz.nextInt();
        	 s4=xyz.nextInt();
        	 s5=xyz.nextInt();
        	 s6=xyz.nextInt();
        	 agg=s1+s2+s3+s4+s5+s6;
        	 per=agg/6;
        	 if(per>35)
        	 {
            	 System.out.println("students pass");
            	 
        	 }
        	 else 
        	 
        	{
        		 
            	 System.out.println("fail");
        	 }
        	 break;
         case 10:
        	      System.out.println("Enter the number");
        	       int no14=xyz.nextInt();
        	       int count=0;
        	       for(int i=0;i<=no14;i++) {
        	     	
        	     	  no14=no14/10;
        	     	  ++count;
        	       }
        	      System.out.printf("digits count is=%d\n",count);
        	 break;
         case 11:
        	 int sum1=0;
        	 System.out.println("Enter the number");
        	 System.out.println("Table print");
        	 int no11=xyz.nextInt();
        	 for(int i=0;i<10;i++) {
        		 sum1=sum1+no11;
            	 System.out.printf("table is %d\n",sum1);
        	 }
        	 break;
         case 12:
        	 int fact=1,i,no13;
        	 System.out.println("Enter the number");
        	 no13=xyz.nextInt();
        	 for(int i11=1;i11<=no13;i11++) {
        		 fact=fact*i11;
        	 }
        	 System.out.printf("factorial number is %d\n",fact);

        	 break;
         case 13:
        	 int no111,temp = 0,rev=0,rem;
        	 System.out.println("Enter the number");
        	 no111=xyz.nextInt();
        	 temp=no111;
        	 while(no111!=0)
        	 {
        	 rem=no111%10;
        	 no111=no111/10;
               rev=rev*10+rem;
        	 }
        	 if(rev==temp) {
        		 System.out.printf("Number is palimdrom\n");
        	 }else {
        		 System.out.printf("number is not palinderom\n");
        	 }
        	 break;
         case 14:
        	 int no1111,sum11=0;
        	 System.out.println("Enter the number");
        	 no1111=xyz.nextInt();
        	 for(i=1;i<no1111;i++)
        	 {
        		 if(no1111%i==0) {
        			 sum11=sum11+i;
        		 }
        	 }
        	 if(sum11==no1111) {
        		 System.out.println("Number is perfect");
        	 }else {
        		 System.out.println("no perfect");
        	 }
        	 break;
         case 15:
        	 int no12;
        	 boolean flag=false;
        	 System.out.println("Enter the number");
        	 no12=xyz.nextInt();
        	 for(int i1=1;i1<no12;i1++) {
        		 if(no12%i1==0) {
        			 flag=true;
        			 break;
        		 }
        	 }if(flag) {
        		 System.out.printf("number is prime");
        	 }
        	 else {
        		 System.out.printf("number not prime");
        	 }
        	 break;
         case 16:
        	 int rem1,num,temp1,sum111=0;
        	 System.out.println("Enter the number");
        	 num=xyz.nextInt();
        	 temp=num;
        	 while (temp != 0)
        	    {
        	        rem = temp % 10;
        	        sum111 = sum111 + rem*rem*rem;
        	        temp = temp / 10;
        	    }
        	    if (sum111 == num)
        	      System.out.printf (" Armstrong number.");
        	    else
        	        System.out.println(" Not Armstrong number.");
        	 break;
         case 17:
        	 System.out.println("Enter the number");
             int no15=xyz.nextInt();
             int f=1;
             for(int i55=1;i55<=no15;i55++) {
           	 f=f*i55;  
             }
             System.out.printf("factorial number is =%d",f);
        	 default:
        		 System.out.println("wrong choice");
         }
      }while(true);
	}

}
