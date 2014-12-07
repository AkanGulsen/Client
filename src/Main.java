import logic.Actionhandler;
import logic.Connector;
import gui.ScreenFrame;

public class Main {

	public static void main(String[] args) {


		Connector ClientServerConnect = new Connector();
		ClientServerConnect.ServerConnect();
		
		new Actionhandler().run();
		
			
	}

}
