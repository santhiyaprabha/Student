import java.io.*;
class StudException extends Exception
{
StudException(String m)
{
System.out.println("Student Exception--"+m);
}
}
class Stud
{
int sno;
String name;
int m1,m2,tot;
StudException se;
float avg;
void input() throws StudException,IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no,name and two marks");
sno=Integer.valueOf(br.readLine());
if(sno<1000 || sno>2000)
throw se=new StudException("Invalid student number");
name=br.readLine();
int l=name.length();
if(l<0 || l>10)
throw se=new StudException("Invlaid  student name");
m1=Integer.valueOf(br.readLine());
m2=Integer.valueOf(br.readLine());
}
void process()
{
tot=m1+m2;
avg=(float)tot/2;
}
public String toString()
{
return(sno+"\t"+name+"\t"+m1+"\t"+m2+"\t"+tot+"\t"+avg);
}
}
class Main
{
public static void main(String arg[])throws IOException
{
Stud s=new Stud();
int f=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do
{
f=0;
try
{
s.input();
s.process();
System.out.println(s);
}catch(StudException se)
{
System.out.println("Enter (y-1 and N-0)");
f=Integer.valueOf(br.readLine());
}
}while(f==1);
}
}
