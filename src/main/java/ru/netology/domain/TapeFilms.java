package ru.netology.domain;

public class TapeFilms {
    private String nameFilm;
    private int id;

    public TapeFilms() {
    }

    public TapeFilms(String nameFilm, int id) {
        this.nameFilm = nameFilm;
        this.id = id;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
