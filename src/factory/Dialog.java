package factory;

import series.Serie;

public abstract class Dialog {
    
    public abstract Serie criarSerie();
    
    public void recomendar(){
        Serie series = criarSerie();
        
        series.mostrarInformacoes();
    }
}
