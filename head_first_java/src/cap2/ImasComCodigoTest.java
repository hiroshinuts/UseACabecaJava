package cap2;

public class ImasComCodigoTest {
	
	public static void main(String[] args) {
		
		ImasComCodigo d = new ImasComCodigo();
		
		d.playSnare();
		d.snare = false;
		d.playTopHat();
		if(d.snare == true){
			d.playSnare();
		}
		
	}

}
