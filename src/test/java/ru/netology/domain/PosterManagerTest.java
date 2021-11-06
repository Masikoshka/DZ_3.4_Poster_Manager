package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void addFilm() {
        PosterManager posterManager = new PosterManager();
        posterManager.addFilm("The Suicide Squad");

        int actual = posterManager.tapeFilms.length;
        int expected = 12;

        assertEquals(expected,actual);
    }

    @Test
    void showTape() {
        PosterManager posterManager = new PosterManager();

        int actual = posterManager.showTape();
        int expected = 10;

        assertEquals(expected,actual);
    }

    @Test
    void showTapeAverage() {
        PosterManager posterManager = new PosterManager(5);

        int actual = posterManager.showTape();
        int expected = 5;

        assertEquals(expected,actual);
    }

    @Test
    void showTapeMax() {
        PosterManager posterManager = new PosterManager(12);

        int actual = posterManager.showTape();
        int expected = 10;

        assertEquals(expected,actual);
    }

    @Test
    void showTapeMin() {
        PosterManager posterManager = new PosterManager(1);

        int actual = posterManager.showTape();
        int expected = 1;

        assertEquals(expected,actual);
    }
}