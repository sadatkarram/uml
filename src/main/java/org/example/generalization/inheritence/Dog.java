package org.example.generalization.inheritence;

// Dog is-a Animal
public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

/*


Animal <── Dog

Arrowhead points upward to the superclass
Dog is-a type of Animal
* */

