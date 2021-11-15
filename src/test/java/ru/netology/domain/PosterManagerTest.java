package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {
    private PosterManager manager = new PosterManager();
    private TapeFilms first = new TapeFilms("The Suicide Squad",1);
    private TapeFilms second = new TapeFilms("The Gentlemen",2);
    private TapeFilms third = new TapeFilms("Wrath of Man",3);
    private TapeFilms fourth = new TapeFilms("Nobody",4);
    private TapeFilms fifth = new TapeFilms("Free Guy",5);
    private TapeFilms sixth = new TapeFilms("Dune: Part One",6);
    private TapeFilms seventh = new TapeFilms("Mortal Kombat",7);
    private TapeFilms eighth = new TapeFilms("Cruella",8);
    private TapeFilms ninth = new TapeFilms("Black Widow",9);
    private TapeFilms tenth = new TapeFilms("Godzilla vs. Kong",10);
    private TapeFilms eleventh = new TapeFilms("Army of the Dead",11);

    @BeforeEach
    public void setUp() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);
    }

    @Test
    void addFilm() {
        TapeFilms twelfth = new TapeFilms("No Time to Die",12);

        TapeFilms[] actual = manager.addFilm(twelfth);
        TapeFilms[] expected = new TapeFilms[]{first, second, third, fourth, fifth, sixth,
                seventh, eighth, ninth, tenth, eleventh, twelfth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showTape() {

        TapeFilms[] actual = manager.showTape();
        TapeFilms[] expected = new TapeFilms[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth,
                fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showTapeAverageСonstructor() {
        PosterManager manager = new PosterManager(5);

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);

        TapeFilms[] actual = manager.showTape();
        TapeFilms[] expected = new TapeFilms[]{eleventh, tenth, ninth, eighth, seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showTapeMaxСonstructor() {
        PosterManager manager = new PosterManager(12);

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);

        TapeFilms[] actual = manager.showTape();
        TapeFilms[] expected = new TapeFilms[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth,
                fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void showTapeMinСonstructor() {
        PosterManager manager = new PosterManager(0);

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);

        TapeFilms[] actual = manager.showTape();
        TapeFilms[] expected = new TapeFilms[]{};

        assertArrayEquals(expected, actual);
    }
}