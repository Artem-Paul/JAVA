package OOP.seminar1.cw1;

import OOP.seminar1.cw1.Cat;

import java.beans.beancontext.BeanContext;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("barsik");   // присваеваем имя через геттер и сеттер
        System.out.println(cat.getName()); // выводим имя через г и с)
        cat.saySomething();
        cat.sayWithInterface();
        BengalCat cat1 = new BengalCat();
        cat1.saySomething();
    }
}
