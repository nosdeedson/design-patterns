package br.com.E3N.businessDelegate.business;

import br.com.E3N.businessDelegate.service.VideoStreamService;

public class BusinessDelegate {
    private final BusinessLookup lookup = new BusinessLookup();

    public void playBackMovie(final String movie) {
        VideoStreamService streamService = lookup.getStreamService(movie);
        streamService.doProcessing();
    }
}
