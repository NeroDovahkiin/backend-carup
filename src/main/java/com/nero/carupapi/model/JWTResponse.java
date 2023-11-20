package com.nero.carupapi.model;

public class JWTResponse {
    private String jwt;

    public JWTResponse() {
    }

    public JWTResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
