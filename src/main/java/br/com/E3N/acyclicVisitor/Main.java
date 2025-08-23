package br.com.E3N.acyclicVisitor;

import br.com.E3N.acyclicVisitor.elementsvisitable.Firewall;
import br.com.E3N.acyclicVisitor.elementsvisitable.Hayes;
import br.com.E3N.acyclicVisitor.elementsvisitable.Router;
import br.com.E3N.acyclicVisitor.elementsvisitable.Zoom;
import br.com.E3N.acyclicVisitor.visitors.ConfigureForLinuxVisitor;
import br.com.E3N.acyclicVisitor.visitors.DiagnosticVisitor;
import br.com.E3N.acyclicVisitor.visitors.Visitor;

public class Main {

    public static void main(String[] args) {
        var hayes = new Hayes();
        var router = new Router();
        var zoom = new Zoom();

        var visitorLinux = new ConfigureForLinuxVisitor();
        var diagnostic = new DiagnosticVisitor();

        hayes.accept(visitorLinux);
        hayes.accept(diagnostic);

        router.accept(diagnostic);
        try {
            zoom.accept(diagnostic);
        } catch (UnsupportedOperationException e ) {
            System.out.println(e.getMessage());
        }

        Visitor zoomVisitor = new Visitor() {
            public void visit(Zoom z) {
                System.out.println("Setting up zoom modem");
                z.dial();
            }
        };
        zoom.accept(zoomVisitor);
        try {
            Firewall firewall = new Firewall();
            firewall.accept(visitorLinux);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
