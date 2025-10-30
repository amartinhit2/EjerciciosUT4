//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot(100,104,85,"pepe");
        Robot robot2 = new Robot(100,100,100,"Mariano");


        while (robot1.getVida() > 0 && robot2.getVida() > 0){
            robot1.combatir(robot2);
            robot2.combatir(robot1);
        }
        System.out.println(robot2);
        System.out.println(robot1);
    }
}