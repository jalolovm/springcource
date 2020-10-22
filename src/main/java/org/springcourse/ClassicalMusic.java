package org.springcourse;

import org.springframework.stereotype.Component;

@Component ("someClassicalMusic")
public class ClassicalMusic implements Music {


    public static ClassicalMusic getClassicalMusic(){
       return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
