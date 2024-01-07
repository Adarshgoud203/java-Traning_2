import java.util.Scanner;
class Employee{
private int id;
private String name;
private String depart;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;
}
public void setDepart(String depart){this.depart=depart;}
public int getId(){return this.id;}
public String getName(){return this.name;}
public String getDepart(){return this.depart;}
}
class Day4Program{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Employee[] ob=new Employee[5];

for(int i=0;i<5;i++){
ob[i]=new Employee();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
ob[i].setDepart(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<5;j++){
System.out.println("ID: "+ob[j].getId());
System.out.println("Name: "+ob[j].getName());
System.out.println("Depart: "+ob[j].getDepart());
}
}
}




//user input
//(2354
Adarsh
ECE
5236
ZOYA
ECE
5236
PRASANTH
ECE
5896
NAWAZ
ECE
5689
PRASAD
ECE
Details are:)

//output
//(ID: 2354
Name: Adarsh
Depart: ECE
ID: 5236
Name: ZOYA
Depart: ECE
ID: 5236
Name: PRASANTH
Depart: ECE
ID: 5896
Name: NAWAZ
Depart: ECE
ID: 5689
Name: PRASAD
Depart: ECE)
