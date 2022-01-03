package com.udacity;

public class LikePhoto {

    public static void likePhoto(int currentLikes, String comment, Boolean like){
        System.out.println("Feedback:" + comment);
        currentLikes++;
        System.out.println("Number of likes: " + currentLikes);
    }
    public static void main(String[] args) {
        likePhoto(5, "the best", true);
    }


}
