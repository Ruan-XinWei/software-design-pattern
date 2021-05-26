package Facade;

public class Main {
    public static void main(String[] args) {
        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.TurnOn();
        System.out.println();
        securityFacade.TurnOff();
    }
}
