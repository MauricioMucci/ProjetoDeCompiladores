
public class BackEndInterpretador {
    
    int computar (ArvoreSintatica arv)
    {
        
        if (arv instanceof Mult)
            return (computar(((Mult) arv).arg1) *
                    computar(((Mult) arv).arg2));
        
        if (arv instanceof Soma)
            return (computar(((Soma) arv).arg1) +
                    computar(((Soma) arv).arg2));
        
        if (arv instanceof Sub)
            return (computar(((Sub) arv).arg1) -
                    computar(((Sub) arv).arg2));
        
        if (arv instanceof Div)
            return (computar(((Div) arv).arg1) /
                    computar(((Div) arv).arg2));
        
        if (arv instanceof Num)
            return ((((Num) arv).num));
        
        return 0;
    }
    
}
