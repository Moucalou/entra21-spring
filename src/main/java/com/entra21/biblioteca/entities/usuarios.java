package com.entra21.biblioteca.entities;

public class usuarios {

    private Integer idUser;
    private String nomeUser;

    public usuarios(Integer idUser, String nomeUser) {
        this.idUser = idUser;
        this.nomeUser = nomeUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }
}
