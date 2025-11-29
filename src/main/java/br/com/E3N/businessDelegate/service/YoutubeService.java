package br.com.E3N.businessDelegate.service;

public class YoutubeService implements VideoStreamService {

    private static YoutubeService instance;

    private YoutubeService() {
    }

    public static YoutubeService getInstance() {
        if (instance == null) {
            instance = new YoutubeService();
        }
        return instance;
    }

    @Override
    public void doProcessing() {
        System.out.println("YoutubeService is processing.");
    }
}
