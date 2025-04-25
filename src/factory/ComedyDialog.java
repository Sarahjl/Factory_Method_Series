package factory;

import series.ComedySerie;
import series.Serie;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ComedyDialog extends Dialog{
    
    @Override
    public Serie criarSerie(){
        return new ComedySerie();
    }
}
