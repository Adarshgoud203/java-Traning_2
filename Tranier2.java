import java.util.Scanner;
class Trainer{
private int tid;
public void setTid(int tid){this.tid=tid;}
public int getTid(){return this.tid;}
public Trainer(int tid)
{this.tid=tid;}
public Trainer()
{this.tid=0;}
}
class Test{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter ID for Trianer:");
int tidin=sc.nextInt();
Trainer[] ob=new Trainer[2];
Trainer ob1=new Trainer(tidin);
System.out.println("tid:"+ob1.getTid());

for(int i=0;i<2;i++){
ob[i]=new Trainer();
System.out.println("Enter ID for Trianer: "); 
}
System.out.println("Details are:\n");
for(int j=0;j<2;j++){
System.out.println("ID:"+ob[j].getTid());
}

}
}