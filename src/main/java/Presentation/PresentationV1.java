package Presentation;
import Metier.MetierImp;

public class PresentationV1 {
    public static void main(String[] args){
        MetierImp metier = new MetierImp();
        System.out.println(metier.calcul());
    }
}
