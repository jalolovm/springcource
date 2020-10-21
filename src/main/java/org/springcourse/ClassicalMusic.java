package org.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {     //ВНИМАНИЕ СЮДА
    }

    public static ClassicalMusic getClassicalMusic(){ // И СЮДА
       return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy(){
        System.out.printf("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
