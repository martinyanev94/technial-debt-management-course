interface Coffee {
    String getDescription();
    double cost();
}

class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double cost() {
        return 1.00;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double cost() {
        return coffee.cost() + 0.50;
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public double cost() {
        return coffee.cost() + 0.20;
    }
}

public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + ": $" + myCoffee.cost());

        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + ": $" + myCoffee.cost());

        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + ": $" + myCoffee.cost());
    }
}
