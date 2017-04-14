
package bonus;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;


/**
 *
 * @author Shubhang
 */
public class Midlet extends MIDlet implements CommandListener{


    private Display display;
   private Form form1;
    private Command exit;
    private Command select;


   

    protected void startApp() {
        display = Display.getDisplay(this);

        select = new Command("Show Button", Command.OK, 0);
        exit = new Command("Exit", Command.EXIT, 0);
        form1 = new Form("Button");
        form1.addCommand(select);
        form1.addCommand(exit);
        form1.setCommandListener(this);
        display.setCurrent(form1);
    }

    protected void pauseApp() {
    }

    protected void destroyApp(boolean unconditional) {
    }

    public void exitMIDlet() {
        destroyApp(true);
        notifyDestroyed();
    }
    public void commandAction(Command c, Displayable d){


        if (c == select){
            Canvas canvas = new my_canvas();
             display = Display.getDisplay(this);
            display.setCurrent(canvas);
        }

      }
 }
