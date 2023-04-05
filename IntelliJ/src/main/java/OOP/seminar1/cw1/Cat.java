package OOP.seminar1.cw1;

public class Cat extends CatMover implements CatInterface{
    private String name;   //private, обращение к переменным только внутри класса
    private int age;     //private, обращение к переменным только внутри класса

    // alt + insert , методы добавляем getter an setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saySomething() {
        System.out.println("MEOW");
    }

    @Override
    public void sayWithInterface() {
        System.out.println("Meow with interface");
    }

    public void say(){
        System.out.println(name);
    }
}
