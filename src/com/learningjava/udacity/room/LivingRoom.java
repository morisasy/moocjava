package com.learningjava.udacity.room;


    public class LivingRoom extends Room{
        // The constructor simply calls the parent's constructor using super()
        public LivingRoom(double width, double height){
            super(width,height);
        }
        // Not allowed to override getArea() here
    }

