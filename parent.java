class parent
 {
  public void pmethod()
  {
   System.out.println("Parent method");
  }
 }
class child extends parent
 {
  public void cmethod()
  {
   System.out.println("child method");
  }
public static void main(String[]args)
  {
   child cobj=new child();
   cobj.cmethod();
   cobj.pmethod();
  }
 }