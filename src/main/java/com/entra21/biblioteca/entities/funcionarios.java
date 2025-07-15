package com.entra21.biblioteca.entities;

public class funcionarios {

    private Integer idFunc;
    private String nomeFunc;

    public funcionarios(Integer idFunc, String nomeFunc) {
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
    }

    public Integer getIdFunc() {
        return idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }
}
