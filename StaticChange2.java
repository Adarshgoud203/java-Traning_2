//change name with change()method 2
class Student {
int rollno;
String name;
static String college="ITS";
static void change(){
college="mtie";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
 class Student2{
public static void main(String args[]){
Student s1=new Student(111,"Adarsh");
Student s2=new Student(222,"Nawaz");
s1.display();
s2.display();
Student.change();
Student s3=new Student(333,"prasad");
s1.display();
s2.display();
s3.display();
}
}



//output
//111 Adarsh ITS
222 Nawaz ITS
111 Adarsh mtie
222 Nawaz mtie
333 prasad mtie
