import java.io.*;
public class Quadratic {
public static void main(String args[])throws IOException
{
double x1,x2,disc,a,b,c;
InputStreamReader obj=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(obj);
System.out.println("enter a,b,c values");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Double.parseDouble(br.readLine());
disc=(b*b)-(4*a*c);
if(disc==0)
{
System.out.println("roots are Real and Equal ");
x1=x2=-b/(2*a);
System.out.println("Root1="+x1+"\nRoot2="+x2);
}
else if(disc>0)
{
System.out.println("roots are Real and Distict");
x1=(-b+Math.sqrt(disc))/(2*a);
x2=(-b-Math.sqrt(disc))/(2*a);
System.out.println("Root1="+x1+"\nRoot2="+x2);
}
else
{
System.out.println("roots are imaginary");
}
}
}