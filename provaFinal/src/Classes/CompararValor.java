package Classes;

import java.util.Comparator;

public class CompararValor implements Comparator<Produto> {

    @Override
    public int compare(Produto v1, Produto v2) {
       
        
        return v1.getValor().compareTo(v2.getValor());
        
            
    }
    
}
