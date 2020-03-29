import java.util.*;
class Student
{
int sno;
String name;
Student(int sno,String name)
{
this.sno=sno;
this.name=name;
}
public String toString()
{
return(sno+" "+name);
}
}
class AExample
{
public static void main(String arg[])
{
List<Student>l=new LinkedList<Student>();
l.add(new Student(26,"Simren"));
l.add(new Student(23,"Kiren"));
l.add(new Student(13,"Reema"));
Collections.sort(l,new Comparator<Student>()
{
public int compare(Student s,Student t)
{
return s.sno-t.sno;
}
});
for(Student i:l)
System.out.println(i);
System.out.println("Sorted Using name");
Collections.sort(l,new Comparator<Student>()
{
public int compare(Student s,Student t)
{
return s.name.compareTo(t.name);
}
});
Iterator itr=l.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}