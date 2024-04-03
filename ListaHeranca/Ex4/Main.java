package ListaHeranca.Ex4;

import javax.swing.*;

public class Main {
    public static void main(String args[]) {
       String user = JOptionPane.showInputDialog("1 - Papel\n2 - Pedra\n 3 - Tesoura");
       Coisa escolhaUsuario;
       switch(user) {
           case "1":
               escolhaUsuario = new Papel(); break;
           case "2":
               escolhaUsuario = new Pedra(); break;
           case "3":
               escolhaUsuario = new Tesoura(); break;
           default:
               escolhaUsuario = new Papel();
               System.out.println("Escolha inválida, você jogará papel.");
               break;
       }
    }
}
