package com.unita.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Post {
    public int userId;
    public int Id;
    public String title;

    @SerializedName("body")
    public String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
