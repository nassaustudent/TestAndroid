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

public class AddspecialcaracteresRobotiumTest5 extends ActivityInstrumentationTestCase2<AddItem> {
    private Solo solo;
    private AddVazioPageObject additemPage;
    private MainActivity vwItem;

    public AddspecialcaracteresRobotiumTest5(){
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



    // TESTE 5
    public void testPreenchercomcaracteresespeciais() throws Exception{
        additemPage.preencherinputItem("Øö¶¥¤¢©§®ßþ»¡ƛƷƸƻƾŴŒœ͏");
        additemPage.preencherinputDesc("ǑƩƔ̴ʤʬʛʓʁɷʭʮ͏");
        View fab = getActivity().findViewById(R.id.fab);
        solo.clickOnView(fab);

    }

}
