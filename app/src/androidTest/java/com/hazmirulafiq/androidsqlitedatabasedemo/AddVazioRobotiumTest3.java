package com.hazmirulafiq.androidsqlitedatabasedemo;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import com.hazmirulafiq.androidsqlitedatabasedemo.AddItem;
import com.hazmirulafiq.androidsqlitedatabasedemo.pageObject.AddPageObject;
import com.hazmirulafiq.androidsqlitedatabasedemo.pageObject.AddVazioPageObject;
import com.robotium.solo.Solo;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Created by ELI on 24/03/2018.
 */

public class AddVazioRobotiumTest3 extends ActivityInstrumentationTestCase2<AddItem> {
    private Solo solo;
    private AddVazioPageObject additemPage;
    private MainActivity vwItem;

    public AddVazioRobotiumTest3(){
        super(AddItem.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(),getActivity());
        additemPage = new AddVazioPageObject(solo);
    }

    @Override
    public void tearDown() throws Exception {
        //solo.finishOpenedActivities();
    }



    // TESTE 3
    public void testPreenchimentode1Vazio() throws Exception{
        additemPage.preencherinputItem("Elioenai");
        additemPage.preencherinputDesc("");
        View fab = getActivity().findViewById(R.id.fab);
        solo.clickOnView(fab);
        assertTrue("Mensagem não exibida",solo.searchText("Please fill in both form!"));
    }

}
