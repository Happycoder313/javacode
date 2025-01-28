
class Animal {
    void sound() {
        System.out.println("DADA:yogesh");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("BETA:nakul");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("POTA:kashif");
    }
}

class hierarchical {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.sound(); 
        dog.bark();  

        Cat cat = new Cat();
        cat.sound(); 
        cat.meow();  
    }
}
