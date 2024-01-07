import java.util.Scanner;
class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;
}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Student[] ob=new Student[3];

for(int i=0;i<3;i++){
ob[i]=new Student();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++){
System.out.println("ID:"+ob[j].getId());
System.out.println("Name:"+ob[j].getName());
}
}
}



//user input
//(2354
prasad
9658
prasanth
8542
Adarsh
Details are:)

//output
//(ID:2354
Name:prasad
ID:9658
Name:prasanth
ID:8542
Name:Adarsh)

