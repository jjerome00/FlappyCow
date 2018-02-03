/**
 * Ghost bird character
 * Copied and modified from NyanCat class
 *
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 * <p>
 * Nyan Cat was drawn by Christopher Torres and momo momo remixed the music by daniwell
 */

package com.quchen.flappycow.sprites;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.quchen.flappycow.Game;
import com.quchen.flappycow.GameView;
import com.quchen.flappycow.R;
import com.quchen.flappycow.Util;

public class GhostBird extends PlayableCharacter {

    /** Static bitmap to reduce memory usage */
    public static Bitmap globalBitmap;

    public GhostBird(GameView view, Game game) {
        super(view, game);
        if (globalBitmap == null) {
            globalBitmap = Util.getScaledBitmapAlpha8(game, R.drawable.ghost_bird);
        }
        this.bitmap = globalBitmap;
        this.width = this.bitmap.getWidth();
        this.height = this.bitmap.getHeight();
        this.y = game.getResources().getDisplayMetrics().heightPixels / 2;
    }

    /**
     * Moves itself via super.move
     * and moves the rainbow and manages its frames
     */
    @Override
    public void move() {
        super.move();
    }

    /**
     * Draws itself via super.draw
     * and the rainbow.
     */
    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /**
     * Calls super.dead,
     * removes the rainbow tail
     * and set the bitmapframe to a dead cat -.-
     *
     * Don't you know cats never die?
     */
    @Override
    public void dead() {
        super.dead();
        this.row = 1;
    }

    @Override
    public void revive() {
        super.revive();
    }

}
