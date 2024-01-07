class Employee{
float salary=4000;
}
class Programmer extends Employee{
int bonus=1000;
public static void main(String args[]){
Programmer p=new Programmer();
System.out.println("Programmer salary: "+p.salary);
System.out.println("Bonus of Programmer is: "+p.bonus);
}
}





//output
//Programmer salary: 4000.0
//Bonus of Programmer is: 1000