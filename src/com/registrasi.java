/**
 * 
 */
/**
 * @author lilisya
 *
 */
package com;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Textbox;

public class registrasi extends SelectorComposer<Component> {
    @Wire
    private Button submitButton, resetButton;
    
    @Wire
    private Textbox nameB, addressB,phoneB;
    
    @Wire
    private Datebox birthdayB;
    @Wire
    private Radiogroup genderB;
    
    @Wire
    private Checkbox acceptTermBox;
 
    @Listen("onCheck = #acceptTermBox")
    public void changeSubmitStatus(){
        if (acceptTermBox.isChecked()){
            submitButton.setDisabled(false);
        }else{
            submitButton.setDisabled(true);
        }
    }
    @Listen("onClick = #resetButton")
    public void resetButton(){
        nameB.setValue(null);
        addressB.setValue(null);
        phoneB.setValue(null);
        birthdayB.setValue(null);
        submitButton.setDisabled(true);
        acceptTermBox.setChecked(false);
    }
 
}