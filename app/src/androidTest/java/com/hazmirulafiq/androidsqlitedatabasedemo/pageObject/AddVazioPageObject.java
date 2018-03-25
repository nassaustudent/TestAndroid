package com.hazmirulafiq.androidsqlitedatabasedemo.pageObject;

import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.hazmirulafiq.androidsqlitedatabasedemo.MainActivity;
import com.hazmirulafiq.androidsqlitedatabasedemo.R;
import com.robotium.solo.Solo;

/**
 * Created by ELI on 24/03/2018.
 */

public class AddVazioPageObject {

    private Solo solo;
    private EditText editinputDesc;
    private EditText editinputItem;
    private EditText editMarks;
    private Button clicarfab, buttonOk;
    private MainActivity mainactivity;



    public AddVazioPageObject(Solo soloRef){
        this.solo = soloRef;
        updateTela();
    }


    private void updateTela() {
        editinputItem = (EditText) solo.getView(R.id.inputItem);
        editinputDesc = (EditText) solo.getView(R.id.inputDesc);
        FloatingActionButton clicarfab = (FloatingActionButton) solo.getView(R.id.fab);
        //buttonOk = (Button) solo.getView(R.id.send_btn);
    }

    public void preencherinputItem(String inputItem) {
        solo.enterText(editinputItem, inputItem);
    }


    public void preencherinputDesc(String inputDesc) {
        solo.enterText(editinputDesc, inputDesc);
    }

    public void clicarBotao() {

    }




}



