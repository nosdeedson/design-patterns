package br.com.E3N.businessDelegate.client;

import br.com.E3N.businessDelegate.business.BusinessDelegate;

public class Mobile {

    private final BusinessDelegate businessDelegate = new BusinessDelegate();

    public void playVideo(final String stream) {
        businessDelegate.playBackMovie(stream);
    }

}
