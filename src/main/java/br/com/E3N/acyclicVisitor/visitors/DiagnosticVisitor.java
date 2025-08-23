package br.com.E3N.acyclicVisitor.visitors;

import br.com.E3N.acyclicVisitor.elementsvisitable.Hayes;
import br.com.E3N.acyclicVisitor.elementsvisitable.Router;

public class DiagnosticVisitor implements Visitor{
    public void visit(Hayes modem){
        System.out.println("DiagnosticVisitor using Hayes");
        modem.connect();
    }

    public void visit(Router modem){
        System.out.println("Diagnostic using Router");
        modem.enableFirewall();
    }
}
