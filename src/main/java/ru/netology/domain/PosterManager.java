package ru.netology.domain;

public class PosterManager {
    private int numberOfFilms = 10;
    String[] tapeFilms = {"The Gentlemen", "Dune: Part One", "Wrath of Man", "Mortal Kombat", "Cruella",
            "Nobody", "Black Widow", "Godzilla vs. Kong", "Free Guy", "Army of the Dead", "No Time to Die"};

    public PosterManager() {
    }

    public PosterManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public void addFilm(String film) {
        int length = tapeFilms.length + 1;
        String[] tmp = new String[length];
        System.arraycopy(tapeFilms, 0, tmp,0, tapeFilms.length);
        int index = tmp.length - 1;
        tmp[index] = film;
        tapeFilms = tmp;
    }

    public int showTape() {
        if (numberOfFilms > tapeFilms.length)
            numberOfFilms = tapeFilms.length;
        if (numberOfFilms > 10)
            numberOfFilms = 10;
        String[] tape = new String[numberOfFilms];
        for (int i = 0; i < tape.length; i++){
            int index = tapeFilms.length - i - 1;
            tape[i] = tapeFilms[index];
        }
        return tape.length;
    }
}
