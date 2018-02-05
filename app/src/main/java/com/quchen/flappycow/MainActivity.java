/**
 * Main Activity / Splashscreen with buttons.
 * 
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */

package com.quchen.flappycow;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.example.games.basegameutils.BaseGameActivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.widget.Toast;

public class MainActivity extends Activity {
    
    /** Name of the SharedPreference that saves the medals */
    public static final String medaille_save = "medaille_save";
    
    /** Key that saves the medal */
    public static final String medaille_key = "medaille_key";
    
    public static final float DEFAULT_VOLUME = 0.3f;
    
    /** Volume for sound and music */
    public static float volume = DEFAULT_VOLUME;
    
    private StartscreenView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new StartscreenView(this);
        setContentView(view);
        setSocket();
    }

//    public GoogleApiClient getApiClient(){
//        return mHelper.getApiClient();
//    }
    
//    public void login() {
//        beginUserInitiatedSignIn();
//    }
    
    public void logout() {
//        signOut();
//        view.setOnline(false);
        view.invalidate();
    }
    
    public void muteToggle() {
        if(volume != 0){
            volume = 0;
            view.setSpeaker(false);
        }else{
            volume = DEFAULT_VOLUME;
            view.setSpeaker(true);
        }
        view.invalidate();
    }
    
    /**
     * Fills the socket with the medals that have already been collected.
     */
    private void setSocket(){
        SharedPreferences saves = this.getSharedPreferences(medaille_save, 0);
        view.invalidate();
    }

    /**
     * Updates the socket for the medals.
     */
    @Override
    protected void onResume() {
        super.onResume();
        setSocket();
    }
//
//    @Override
//    public void onSignInFailed() {
//        //noop
//    }
//
//    @Override
//    public void onSignInSucceeded() {
//        view.invalidate();
//        if(AccomplishmentBox.isOnline(this)){
//            AccomplishmentBox.getLocal(this).submitScore(this, getApiClient());
//        }
//    }
    
}
