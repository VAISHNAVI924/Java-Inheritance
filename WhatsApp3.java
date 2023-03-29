package methodoverriding;

public class WhatsApp3 extends WhatsApp2 {
	
	
	void voicecall() {
     super.voicecall();
     
      System.out.println("ringing");
     }
void story() {
	System.out.println("image supported");
}
}
