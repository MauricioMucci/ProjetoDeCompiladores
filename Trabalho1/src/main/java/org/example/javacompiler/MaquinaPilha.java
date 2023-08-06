import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Stack;

public class MaquinaPilha {
    
    public static void main(String[] args) {
        BigDecimal resultado = new BigDecimal("0");
        Stack<BigDecimal> pilha = new Stack<>();
        
        try {
            BufferedReader arquivo = new BufferedReader(
                    new FileReader(args[0])
            );
            String str = arquivo.readLine();
            
            do {
                if (str.contains("PUSH")) {
                    pilha.push(BigDecimal.valueOf(
                            Long.parseLong(str.split(" ")[1]))
                    );
                }
                if (str.contains("SUM")){
                    resultado = pilha.pop().add(pilha.pop());
                    pilha.push(resultado);
                }
                if (str.contains("SUB")){
                    resultado = pilha.pop().subtract(pilha.pop());
                    pilha.push(resultado);
                }
                if (str.contains("MULT")){
                    resultado = pilha.pop().multiply(pilha.pop());
                    pilha.push(resultado);
                }
                if (str.contains("DIV")){
                    resultado = pilha.pop().divide(pilha.pop(), new MathContext(4));
                    pilha.push(resultado);
                }
                if (str.contains("PRINT"))
                    System.out.println(resultado);
                str = arquivo.readLine();
            } while (str != null);
            
        } catch (Exception e) {
            System.out.printf("Erro na leitura: %s", e);
        }
        
    }
}
