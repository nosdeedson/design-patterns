package br.com.E3N.acyclicVisitor.visitors;

import br.com.E3N.acyclicVisitor.elementsvisitable.Hayes;

public class ConfigureForLinuxVisitor implements Visitor {
    public void visit(Hayes hayes){
        System.out.println("Visiting Hayes for linux environment.");
        hayes.connect();
    }
}
