package methodoverriding;

public class WhatsApp2 extends WhatsApp1 {
void sendmsg() {
	super.sendmsg();
	System.out.println("bluetick");
}
void voicecall() {
	System.out.println("calling");
}
}
