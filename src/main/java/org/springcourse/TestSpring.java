package org.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("musicBean",ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean",ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        System.out.println("Song name: " + firstMusicPlayer.getName());
//        System.out.println("Volume: " + firstMusicPlayer.getVolume());

        context.close();
    }
}
