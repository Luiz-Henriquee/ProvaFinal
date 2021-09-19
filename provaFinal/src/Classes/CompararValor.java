package Classes;

import java.util.Comparator;

public class CompararValor implements Comparator<Produto> {

    @Override
    public int compare(Produto v1, Produto v2) {
        
        double maxValor = v1.getValor() + v2.getValor();

        if (maxValor!= 0);
        return 0;
            
    }
    
}
