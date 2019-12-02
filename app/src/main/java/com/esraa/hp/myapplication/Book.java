package com.esraa.hp.myapplication;


import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable{


    private String title;
    private String author;
    private int imageId;
    private float ratingBar;
    private String date;

    public Book(String title,String author,int imageId,float ratingBar,String date){
        this.title=title;
        this.author=author;
        this.imageId=imageId;
        this.ratingBar=ratingBar;
        this.date=date;
    }

    protected Book(Parcel in) {
        title = in.readString();
        author = in.readString();
        imageId = in.readInt();
        ratingBar = in.readFloat();
        date = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public float getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(float ratingBar) {
        this.ratingBar = ratingBar;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(author);
        parcel.writeInt(imageId);
        parcel.writeFloat(ratingBar);
        parcel.writeString(date);
    }

}
