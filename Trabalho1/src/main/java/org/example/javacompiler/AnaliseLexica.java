import java.io.*;

enum TokenType{
	NUM, SOMA, SUB, MULT, DIV, APar, FPar, EOF
}

class Token{
	char lexema;
	String strLexema;
	TokenType token;
	
	Token (char l, TokenType t)	{
		lexema = l;
		token = t;
	}
	
	Token(String str, TokenType token) {
		this.strLexema = str;
		this.token = token;
	}
}

class AnaliseLexica {
	
	BufferedReader arquivo;
	
	AnaliseLexica(String a) throws Exception
	{
		this.arquivo = new BufferedReader(new FileReader(a));
	}
	
	Token getNextToken() throws Exception
	{
		Token token;
		int eof = -1;
		char currchar;
		int currchar1;
		
		char nextChar;
		
		do{
			currchar1 =  arquivo.read();
			currchar = (char) currchar1;
		} while (currchar == '\n' || currchar == ' '
				|| currchar =='\t' || currchar == '\r');
		
		if(currchar1 != eof && currchar1 != 10)
		{
			if (currchar >= '0' && currchar <= '9') {
				arquivo.mark(10);
				nextChar = (char) arquivo.read();
				
				if (nextChar >= '0' && nextChar <= '9') {
					StringBuilder nDigitos = new StringBuilder();
					nDigitos.append(currchar);
					nDigitos.append(nextChar);
					
					arquivo.mark(10);
					nextChar = (char) arquivo.read();
					
					while (nextChar >= '0' && nextChar <= '9') {
						nDigitos.append(currchar);
						arquivo.mark(10);
						nextChar = (char) arquivo.read();
					}
					
					arquivo.reset();
					return (new Token(nDigitos.toString(), TokenType.NUM));
				}
				arquivo.reset();
				return (new Token(currchar, TokenType.NUM));
			}
			else
				switch (currchar){
					case '(':
						return (new Token (currchar,TokenType.APar));
					case ')':
						return (new Token (currchar,TokenType.FPar));
					case '+':
						return (new Token (currchar,TokenType.SOMA));
					case '-':
						return (new Token (currchar,TokenType.SUB));
					case '*':
						return (new Token (currchar,TokenType.MULT));
					case '/':
						return (new Token (currchar,TokenType.DIV));
					default: throw (new Exception("Caractere inválido: " + ((int) currchar)));
				}
		}
		
		arquivo.close();
		
		return (new Token(currchar,TokenType.EOF));
		
	}
}
