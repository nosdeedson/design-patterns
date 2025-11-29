package br.com.E3N.businessDelegate.service;

public class NetflixService implements VideoStreamService {
    private static NetflixService instance;

    private NetflixService() {
    }

    //    using the singleton pattern
    public static NetflixService getInstance() {
        if (instance == null) {
            instance = new NetflixService();
        }
        return instance;
    }

    @Override
    public void doProcessing() {
        System.out.println("NetflixService is processing");
    }
}
