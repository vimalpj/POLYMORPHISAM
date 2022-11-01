package POLYMORPHISHAM;
class father
{
      void add()
      {
    	  System.out.println("my father names is jayaram");
      }
}
class child extends father
{
      void add()
      {
    	  System.out.println("my  names is vimal ");
      }
}
class child1 extends father
{
      void add()
      {
    	  System.out.println("my brother name is balan");
      }
   
}
class child2 extends father
{
      void add()
      {
    	  System.out.println("my brother name is vivek");
      }
}
public class Methordoverride {
	public static void main(String[] args) {

		father ca=new child();
		father ca1=new child1();
		father ca2=new child2();
		//fa.add();
		ca.add();
		ca1.add();
		ca2.add();
	}

}
