package ru.netology.domain;

public class PosterManager {
    private int numberOfFilms = 10;

    public PosterManager() {
    }

    public PosterManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    private TapeFilms[] films = new TapeFilms[0];

    public TapeFilms[] addFilm(TapeFilms film) {
        int length = films.length + 1;
        TapeFilms[] tmp = new TapeFilms[length];
        System.arraycopy(films, 0, tmp,0, films.length);
        int index = tmp.length - 1;
        tmp[index] = film;
        films = tmp;
        return films;
    }

    public TapeFilms[] showTape() {
        if (numberOfFilms > films.length)
            numberOfFilms = films.length;
        TapeFilms[] tape = new TapeFilms[this.numberOfFilms];
        for (int i = 0; i < tape.length; i++){
            int index = films.length - i - 1;
            tape[i] = films[index];
        }
        return tape;
    }
}
