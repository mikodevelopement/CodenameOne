/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm("Main", null);
        } else {
            Form f = (Form)createContainer(resPath, "Main");
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Button findSend(Component root) {
        return (com.codename1.ui.Button)findByName("Send", root);
    }

    public com.codename1.ui.Button findSend() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Send", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Send", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Form findMain(Component root) {
        return (com.codename1.ui.Form)findByName("Main", root);
    }

    public com.codename1.ui.Form findMain() {
        com.codename1.ui.Form cmp = (com.codename1.ui.Form)findByName("Main", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Form)findByName("Main", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findDelete(Component root) {
        return (com.codename1.ui.Button)findByName("Delete", root);
    }

    public com.codename1.ui.Button findDelete() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Delete", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Delete", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findList(Component root) {
        return (com.codename1.ui.List)findByName("List", root);
    }

    public com.codename1.ui.List findList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("List", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("List", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
    aboutToShowThisContainer = c;
        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void onCreateMain() {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("List".equals(listName)) {
            return initListModelList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        if(c.getParent().getLeadParent() != null) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Main")) {
            if("Button1".equals(c.getName())) {
                onMain_Button1Action(c, event);
                return;
            }
            if("List".equals(c.getName())) {
                onMain_ListAction(c, event);
                return;
            }
            if("Send".equals(c.getName())) {
                onMain_SendAction(c, event);
                return;
            }
            if("Delete".equals(c.getName())) {
                onMain_DeleteAction(c, event);
                return;
            }
        }
    }

      protected void onMain_Button1Action(Component c, ActionEvent event) {
      }

      protected void onMain_ListAction(Component c, ActionEvent event) {
      }

      protected void onMain_SendAction(Component c, ActionEvent event) {
      }

      protected void onMain_DeleteAction(Component c, ActionEvent event) {
      }

}
