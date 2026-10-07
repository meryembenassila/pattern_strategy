package Benassila.Meryem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
     Context context = new Context();
     Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> strategyHashMap =new HashMap<>();
        Strategy strategy;
        while (true){
         System.out.println("Quelle Stratégie");
         String str = scanner.nextLine();

         strategy = strategyHashMap.get(str);
         if(strategy == null){
             strategy = (Strategy) Class.forName("Benassila.Meryem.StrategyImpl"+str).getConstructor().newInstance();
             strategyHashMap.put(str,strategy);
             System.out.println("creation d'un nouveau objet de StrategyImpl"+str);
         }
         
         context.setStrategy(strategy);
         context.effectuerOperation();
     }



}}

//ce scanner c'est comme l'idée de choix des extentions pour ouvrir un fichier en word