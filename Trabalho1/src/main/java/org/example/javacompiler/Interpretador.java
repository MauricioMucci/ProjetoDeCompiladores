import java.io.*;

public class Interpretador {
    
    public static void main(String[]args)
    {
        ArvoreSintatica arv=null;
        
        try{
            
            AnaliseLexica al = new AnaliseLexica(args[0]);
            Parser as = new Parser(al);
            
            arv = as.parseProg();
            
            BackEndInterpretador backend = new BackEndInterpretador();
            int codigo = backend.computar(arv);
            BufferedReader arquivo = new BufferedReader(new FileReader(args[0]));
            String linha = "";
            while (true) {
                linha = arquivo.readLine();
                if (linha != null)
                    System.out.printf(linha);
                else
                    break;
            }
            System.out.printf(" = %d%n", codigo);
            arquivo.close();
        }catch(Exception e)
        {
            System.out.println("Erro:\n" + e);
        }
    }
}
