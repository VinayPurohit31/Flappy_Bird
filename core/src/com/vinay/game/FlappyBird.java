package com.vinay.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class FlappyBird extends ApplicationAdapter {
    SpriteBatch batch;
    Texture background;
    Texture[] birds;
    Texture topbar;
    Texture bottombar;
    float velocity = 0;
    float gravity = 1;
    float birdY = 0;
    float gap = 400;
    int flapState = 0;
    int gamestate = 0;
    float maxTubeOffset;

    Random random;
    float tubevalocity= 4;

    int noOfTube = 6;
    float tubeX;
    float tubeOffset;
    float distanceBetweenTube ;


    @Override
    public void create() {
        batch = new SpriteBatch();
        background = new Texture("bg2.png");
        birds = new Texture[2];
        birds[0] = new Texture("bird.png");
        birds[1] = new Texture("bird2.png");
        birdY = Gdx.graphics.getHeight() / 2 - birds[flapState].getHeight() / 2;
        topbar = new Texture("toptube.png");
        bottombar = new Texture("bottomtube.png");
        maxTubeOffset = Gdx.graphics.getHeight() / 2 - gap / 2 - 100;
        random = new Random();
        tubeX =Gdx.graphics.getWidth() / 2 - topbar.getWidth() / 2;
        distanceBetweenTube = Gdx.graphics.getWidth()/2;
    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        if (gamestate != 0) {
            if (Gdx.input.justTouched()) {
                velocity = -25;

                tubeOffset = (random.nextFloat() - 0.5f) * maxTubeOffset;
                tubeX = Gdx.graphics.getWidth() / 2 - topbar.getWidth() / 2;
            }
            tubeX = tubeX-tubevalocity;

            float topTubeY = Gdx.graphics.getHeight() / 2 + gap / 2 + tubeOffset;
            float bottomTubeY = Gdx.graphics.getHeight() / 2 - gap / 2 - bottombar.getHeight() + tubeOffset;

            batch.draw(topbar,tubeX, topTubeY);
            batch.draw(bottombar, tubeX, bottomTubeY);

            if (birdY > 0 || velocity < 0) {
                velocity = velocity + gravity;
                birdY -= velocity;
            }
        } else {
            if (Gdx.input.justTouched()) {
                gamestate = 1;
            }
        }

        // For bird to flap its wings
        flapState = flapState == 0 ? 1 : 0;
        batch.draw(birds[flapState], Gdx.graphics.getWidth() / 2 - birds[flapState].getWidth() / 2, birdY);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        background.dispose();
    }
}
