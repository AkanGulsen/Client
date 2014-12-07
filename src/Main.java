import logic.ActionHandlers;
import logic.ConnectToServer;
import gui.ScreenFrame;

public class Main {

	public static void main(String[] args) {


//		ConnectToServer ClientServerConnect = new ConnectToServer();
//		ClientServerConnect.ServerConnect();
		
		new ActionHandlers().run();
		
		
		
	}

}
