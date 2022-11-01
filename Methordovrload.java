package POLYMORPHISHAM;
class methord
{

 String add(int a, String b, int c)
               {
		 return a+b+c;
	           }

void add(int a,int b,int c)
{
        System.out.println(a+b+c);
}

void add(int a,int b)
{
		System.out.println(a);
}
}
public class Methordovrload {
public static void main(String[] args) {
	methord v=new methord();
	System.out.println(v.add(1,"vimal",3));
	v.add(1,2,3);
	v.add(1,2); 
	
}
}
