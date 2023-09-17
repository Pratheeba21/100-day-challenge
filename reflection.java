import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;  
  public class MyJavap
  {  
   public static void main(String[] args)throws Exception 
   {  
    Class c=Class.forName(args[0]);  
    System.out.println("Fields........");  
    Field f[]=c.getDeclaredFields();  
    for(int i=0;i<f.length;i++)  
        System.out.println(f[i]);  
    System.out.println("Constructors........");  
    Constructor con[]=c.getDeclaredConstructors();  
    for(int i=0;i<con.length;i++)  
        System.out.println(con[i]);  
    System.out.println("Methods........");  
    Method m[]=c.getDeclaredMethods(); 
    for(int i=0;i<m.length;i++)  
        System.out.println(m[i]);  
   }  
}  
