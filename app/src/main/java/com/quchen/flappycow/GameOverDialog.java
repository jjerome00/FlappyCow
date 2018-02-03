/**
 * The dialog shown when the game is over
 *
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */

package com.quchen.flappycow;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;

public class GameOverDialog extends Dialog {
    /** The game that invokes this dialog */
    private Game game;

    public GameOverDialog(Game game) {
        super(game);
        this.game = game;
        this.setContentView(R.layout.gameover);
        this.setCancelable(false);
    }

    public void init() {
        Button okButton = (Button) findViewById(R.id.b_ok);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                game.finish();
            }
        });

        Button reviveButton = (Button) findViewById(R.id.b_revive);
        reviveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.playNyanCat();
            }
        });
        game.playTada();
    }
}
