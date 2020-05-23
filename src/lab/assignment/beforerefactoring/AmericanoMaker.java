package lab.assignment.beforerefactoring;

public class AmericanoMaker extends CoffeeMakerTemplate {
    public AmericanoMaker(){

    }
    @Override
    protected void addIngredients(){
        System.out.println("Add more hot water");
    }
    @Override
    protected void finalTouch(){
        System.out.println("Add sugar and cream");
    }
}
