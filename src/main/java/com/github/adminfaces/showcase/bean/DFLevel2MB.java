package com.github.adminfaces.showcase.bean;

import org.omnifaces.cdi.ViewScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rafael-pestano on 22/06/17.
 */
@Named("dfLevel2MB")
@ViewScoped
public class DFLevel2MB implements Serializable {

    public void openLevel3() {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("appendTo", "@(body)");
        options.put("styleClass", "dlg3");
        RequestContext.getCurrentInstance().openDialog("level3", options, null);
    }

    public void onReturnFromLevel3(SelectEvent event) {
        //pass back to level 1
        RequestContext.getCurrentInstance().closeDialog(event.getObject());
    }
}
