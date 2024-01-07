//change name without change()method
class Student{
int rollno;
String name;
static String college="ITS";
Student(int r,String n){
rollno = r;
name = n;
}
void display (){System.out.println(rollno+" "+name+" "+college);}
}
class Student2{
public static void main(String args[]){
   Student s1=new Student(999,"Prashanth");
    Student s2=new Student(777,"Vsdvsv");
Student.college="Mtie";
s1.display();
s2.display();
}
}



//output
//999  prashanth mtie
//777 vsdvsv mtie