package factory;

import series.SciFiSerie;
import series.Serie;

public class SciFiDialog extends Dialog{
    @Override
    public Serie criarSerie(){
        return new SciFiSerie();
    }
}
