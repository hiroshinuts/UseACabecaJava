package cap2;

public class SejaCompilador2Test {

	public static void main(String[] args) {
		
		SejaCompilador2 d = new SejaCompilador2();
		d.canRecord = true;
		d.playDVD();
		
		if(d.canRecord == true){
			d.recordDVD();
		}
		
	}
	
}
