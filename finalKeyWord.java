class Bike9{
final int speedlimit=90;
void run(){
speedlimit=400;
System.out.println(speedlimit);
}
public static void main(String args[]){
Bike9 obj=new Bike9();
obj.run();
}
}





//output
//first it comes compile time error
//later if we remove the speedlimit=400 
//if we use final keyword and that value is final not changeable 