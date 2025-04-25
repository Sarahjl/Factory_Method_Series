/*
    Essa é a class main que será executada o projeto.
    Teste
*/

package padrao;

import factory.ComedyDialog;
import factory.SciFiDialog;
import factory.Dialog;
import java.util.Scanner;

public class Principal {
    private static Dialog dialog;
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um gênero de série (comedia ou scifi): ");
        String escolha = entrada.nextLine().toLowerCase();
        
        switch(escolha){
            case "comedia":
                dialog = new ComedyDialog();
                break;
            case "scifi":
                dialog = new SciFiDialog();
                break;
            default:
                System.out.println("Não encontrado");
                return;
        }

        System.out.println("");
        dialog.recomendar();
    }
}