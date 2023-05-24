package AbstractFactoryPatternDesign;

public class Dog implements IAnimal{

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "Bark";
    }

    @Override
    public String type() {
        // TODO Auto-generated method stub
       return "Dog";
    }
    
}
