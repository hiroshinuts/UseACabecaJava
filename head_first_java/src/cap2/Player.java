package cap2;

public class Player {

	Integer number;
	
	public void guess(){
		
		number = (int) (Math.random() * 10 );
		System.out.println("Estou pensando em " + number);
		
	}
	
	
}
