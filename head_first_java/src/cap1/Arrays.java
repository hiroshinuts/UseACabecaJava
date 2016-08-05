package cap1;

public class Arrays {
	
	public static void main(String[] args) {
		
		String[] wordListOne = {"24/7" , "varas camadas" , "30.000 pes", "B-to-B", "todos ganham",
				"front-end", "baseado na web", "difundido", "inteligente", "seis", "sigma", "caminho"
						+ "critico", "dinamico"};
		
		String[] wordListTwo = {"habilitado",  "adesivo",  "valor agregado", "orientado" ,
				"central", "distribuido", "agrupado",  "solidariedade",  "indeendente da maquina",
				"posicionado", "em rede", "indepente da maquina", "alinhado", "destinado", "compartilhado",
				"cooperativo", "acelerado"};
		
		String[] wordListThree = {"processo", "ponto maximo", "solucao", "arquitetura"	, "habilitacao no"
				+ "nucleo", "estrategia", "mindshare", "portal", "espaco", "visao", "paradigma", "missao"};
		
		
		
		int oneLenght = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLenght);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		
		System.out.println("Precisamos de " + phrase);
		
		}
		
		
	}


