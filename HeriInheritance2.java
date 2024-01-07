class Animal{
//method in superclass
public void eat(){
System.out.println("I can eat");
}
}
//Dog inherits Animal
class Dog extends Animal{
//overriding the eat()method
//@override
public void eat(){
System.out.println("I eat dog food");
}
public void bark(){
System.out.println("I can bark");
}
}
class Test{
public static void main(String args[]){
Dog labrador=new Dog();
labrador.bark();
labrador.eat();
}
} 