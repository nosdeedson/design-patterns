package br.com.E3N.businessDelegate.business;

import br.com.E3N.businessDelegate.service.NetflixService;
import br.com.E3N.businessDelegate.service.VideoStreamService;
import br.com.E3N.businessDelegate.service.YoutubeService;

import java.util.Locale;

public class BusinessLookup {

    public VideoStreamService getStreamService(final String streaming) {
        if (streaming.toLowerCase(Locale.ROOT).contains("die hard")) {
            return NetflixService.getInstance();
        }
        return YoutubeService.getInstance();
    }
}
