package com.hazmirulafiq.androidsqlitedatabasedemo;

import android.support.design.widget.FloatingActionButton;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import com.hazmirulafiq.androidsqlitedatabasedemo.pageObject.AddPageObject;
import com.robotium.solo.Solo;

/**
 * Created by ELI on 24/03/2018.
 */

public class AddRobotiumTest1 extends ActivityInstrumentationTestCase2<AddItem> {
    private Solo solo;
    private AddPageObject additemPage;
    private MainActivity vwItem;

    public AddRobotiumTest1(){
        super(AddItem.class);
    }


    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(),getActivity());
        additemPage = new AddPageObject(solo);
    }

    @Override
    public void tearDown() throws Exception {
        //solo.finishOpenedActivities();
    }


    // TESTE 1
    public void testPreencherCampos() throws Exception{
        additemPage.preencherinputItem("Elioenai");
        additemPage.preencherinputDesc("Aluno");
        View fab = getActivity().findViewById(R.id.fab);
        solo.clickOnView(fab);
    }



}
