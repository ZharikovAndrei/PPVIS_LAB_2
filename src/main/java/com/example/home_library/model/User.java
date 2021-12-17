package com.example.home_library.model;

import java.util.Collection;

public class User {
    private String login;
    private String password;

    public void verifyLogin(String login){}
    public void verifyPassword(String password){}
    public boolean addBookToMyLibrary(Book book){}
    public boolean addBookFavorite(Book book){}
    public boolean addBookToCollection(Book book){}
    public boolean addBookToDownloaded(Book book){}
    public boolean addAudioToMyLibrary(Audio audio){}
    public boolean addAudioToFavorite(Audio audio){}
    public boolean addCollection(Collection collection){}
    public boolean addVideoToDownloaded(Video video){}
    public boolean addVideoToCollection(Video video){}
    public boolean addVideoToFavorite(Video video){}
    public boolean addVideoToDownloaded(Video video){}
    public boolean addAudioToDownloaded(Audio audio){}
    public boolean addAudioToCollection(Audio audio){}
    public boolean deleteBookToMyLibrary(Book book){}
    public boolean deleteBookFavorite(Book book){}
    public boolean deleteBookToCollection(Book book){}
    public boolean deleteBookToDownloaded(Book book){}
    public boolean deleteAudioToMyLibrary(Audio audio){}
    public boolean deleteAudioToFavorite(Audio audio){}
    public boolean deleteCollection(Collection collection){}
    public boolean deleteVideoToDownloaded(Video video){}
    public boolean deleteVideoToCollection(Video video){}
    public boolean deleteVideoToFavorite(Video video){}
    public boolean deleteVideoToDownloaded(Video video){}
    public boolean deleteAudioToDownloaded(Audio audio){}
    public boolean deleteAudioToCollection(Audio audio){}

}
