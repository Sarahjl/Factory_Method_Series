package padrao;

import factory.SciFiDialog;
import factory.Dialog;

public class Principal {
    public static void main(String[] args) {
        Dialog dialog = new SciFiDialog();
        dialog.recomendar();
    }
}