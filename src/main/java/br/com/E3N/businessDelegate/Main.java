package br.com.E3N.businessDelegate;

import br.com.E3N.businessDelegate.client.Mobile;
import br.com.E3N.businessDelegate.client.Website;

public class Main {

    public static void main(String[] args) {
//        representing different kind of clients
        var mobile = new Mobile();
        var website = new Website();

        mobile.playVideo("die hard");
        website.playVideo("dead pool");
    }
}
