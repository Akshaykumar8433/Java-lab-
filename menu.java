import java.util.*;
class Fact{
	void factorial(int n){
	  int i=1,f=1;
		while(i<=n)
		{
			f=f*i;
            i=i+1;
		}
		System.out.println("Factorial Is "+f);
	}
}
class reverse{
	void rev(int n){
		int r=0,d;
		while(n>0){
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println("Reverse Is "+r);
	}
}
class Arm{
	void Armstrong(int n){
		int r=0,d;
		while(n>0){
			d=n%10;
			r=r+(d*d*d);
			n=n/10;
		}
		System.out.println("Reverse Is "+r);
	}
}
class palin{
	void palindrome(int n){
		int r=0,d,a;
		a=n;
		while(n>0){
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		if(r==a)
		System.out.println("Number is Palindrome");
		else
		System.out.println("Number is Not Palindrome");
	}
}
class prime{
	void primeno(int a)
	{
        int i,l=0,n=a;
        for(i=2;i<n/2;i++){
            if(n%i==0){
                l=1;
                break;
            }
        }
        if(l==0)
            System.out.println(a+"no. is prime");
        else
            System.out.println(a+"no. is not prime");
	}
}
class fibo{
	void fibonaciS(int a)
	{
        int n=a,i,d=0,b=1;
        for(i=0;i<n;i++){
            int c =d+b;
            System.out.println(c);
            d=b;
            b=c;
        }
    }
}
class menu{
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Factorial 2.Reverse 3.Armstrong 4.Palindrome 5.Prime 6.Fibonacci Series");
		System.out.println("Enter your Choice ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter number ");
				num=sc.nextInt();
				Fact f=new Fact();
				f.factorial(num);
				break;
			case 2:
				System.out.println("Enter number ");
				num=sc.nextInt();
				reverse r=new reverse();
				r.rev(num);
				break;
			case 3:
				System.out.println("Enter number ");
				num=sc.nextInt();
				Arm a=new Arm();
				a.Armstrong(num);
				break;
			case 4:
				System.out.println("Enter number ");
				num=sc.nextInt();
				palin p=new palin();
				p.palindrome(num);
				break;
			case 5:
				System.out.println("Enter number ");
				num=sc.nextInt();
				prime pr=new prime();
				pr.primeno(num);
				break;
			case 6:
				System.out.println("Enter number ");
				num=sc.nextInt();
				fibo fi=new fibo();
				fi.fibonaciS(num);
				break;
			default:
				System.out.println("Invalide Choce!");
		}
	}
}