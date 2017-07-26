import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import javax.microedition.rms.*;

/**
 * @author dotID
 */

public class TODOApp extends MIDlet implements CommandListener{
    Display display;
    Menu canvas;
    Form formTodo;
    List recList;
    TextField txtMauNgapain, txtDimana;
    DateField dateKapan;
    RecordStore rs;
    Ticker ticker = new Ticker("TODOApp");
    byte[] data = null;
    Command exitCommand = new Command("Exit", Command.EXIT, 1);
    Command okeCommand = new Command("OKE", Command.OK, 1);
    Command simpanCommand = new Command("Save", Command.OK, 1);
    
    public TODOApp(){
        
    } 
    

    public void startApp() {
        if (display == null) {
            display = Display.getDisplay(this);
            canvas = new Menu();
        }
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    class Menu extends Canvas implements CommandListener{

        protected void paint(Graphics g) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void commandAction(Command c, Displayable d) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
