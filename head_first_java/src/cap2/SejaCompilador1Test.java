package cap2;

public class SejaCompilador1Test {

	public static void main(String[] args) {
		
		//Faltou instanciar o Objeto
		SejaCompilador1 t = new SejaCompilador1();
		
		t.canRecord = true;
		t.playTape();
		
		if(t.canRecord == true){
			t.recordTape();
		}
		
	}
	
}
