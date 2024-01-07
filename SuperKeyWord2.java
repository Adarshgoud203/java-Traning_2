class A{
void eat(){System.out.println("Straving.....");}

}
class Animal extends A{
void eat(){System.out.println("eating......");}
}
class Dog extends Animal{
void eat(){System.out.println("eating bread....");
}
void bark(){System.out.println("barking...");}
void work(){
super.eat();
bark();
}
}
class TestSuper3{
public static void main(String args[]){
Dog d=new Dog();
d.work();
}
}
