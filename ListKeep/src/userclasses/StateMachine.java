/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.UIBuilder;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    

	public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars() {
    }

    protected void onMain_SendAction(Component c, ActionEvent event) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
    	
    	System.out.println("But: " + findButton1().getName());    	
    }
}
