package cap1;

public class MensagemMisturada {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		while(x < 5) {
			
			//BLOCO PARA COLOCAR OS CANDIDATOS\\
			
			//ENTRADA
			//y = x - y;
			//SAIDA
			//00 11 21 32 42
			
			//ENTRADA
			//y = y + x;
			//SAIDA
			//00 11 23 36 410
			
			//ENTRADA
			//y = y+ 2;
			//if(y> 4){
			//	y = y-1;
			//}
			//SAIDA
			//02 14 25 36 47
			
			//ENTRADA
			//x = x+ 1;
			//y = y + x;
			//SAIDA
			//11 34 59
			
			
			//ENTRADA
			if(y < 5){
				x = x + 1;
				if( y < 3 ){
					x= x-1;
				}
			}
			y = y + 2;
			//SAIDA
			// 02 14 36 48
			
			System.out.println(x + "" + y + "");
			x= x + 1;
		}
		
	}
	
}
