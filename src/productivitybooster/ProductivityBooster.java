
package productivitybooster;

import java.awt.Toolkit;


public class ProductivityBooster {

   
    public static void main(String[] args) {
         mainMenu start = new mainMenu(); 
        Toolkit tk = Toolkit.getDefaultToolkit();
        int width =(int) tk.getScreenSize().getWidth();
         int height =(int) tk.getScreenSize().getHeight();

        start.setSize(width,height);
        start.setVisible(true);
    }
    
}
