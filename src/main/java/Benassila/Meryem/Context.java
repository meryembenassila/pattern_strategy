package Benassila.Meryem;

public class Context {
    private Strategy strategy= new DefaultStrategyImpl();

   public void effectuerOperation(){
       System.out.println("************************");
       strategy.operatioStrategy();
       System.out.println("========================");

   }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
