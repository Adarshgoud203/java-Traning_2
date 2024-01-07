import java.util.Scanner;
class Tranier{
private int tid;
public void setTid(int tid){this.tid=tid;}
public int getTid(){return this.tid;}
public Tranier(int tid){this.tid=tid;}
public Tranier()
{this.tid=0;}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter teacher id: ");
int tidin=sc.nextInt();
Tranier ob1=new Tranier(tidin);
System.out.println("tid: "+ob1.getTid());
}
}






//output
//Enter teacher id:
//2563
//tid: 2563
