package com.example.home_library.model;

public class Admin {
    private String login;
    private String password;
    private int accessKey;

    public void verifyLogin(String login){}
    public void verifyPassword(String password){}
    public boolean deleteVideoFromBase(Video video){}
    public boolean deleteAudioFromBase(Audio audio){}
    public boolean deleteBookFromBase(Book book){}

}
