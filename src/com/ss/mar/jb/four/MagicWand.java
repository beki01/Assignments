package com.ss.mar.jb.four;

public class MagicWand {
    private static volatile MagicWand INSTANCE = null;
    private String magicWords;

    private MagicWand() {
        this.magicWords =  "Abra Cadabra";
    }

    public static MagicWand getInstance(){

        if( INSTANCE == null ){

            //To make thread safe
            synchronized (MagicWand.class){
                if(INSTANCE == null) INSTANCE = new MagicWand();
            }
        }

        return  INSTANCE;
    }
}
