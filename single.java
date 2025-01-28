
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

 class single {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.sound(); 
        dog.bark();  
    }
}
