package br.com.E3N.acyclicVisitor.elementsvisitable;

import br.com.E3N.acyclicVisitor.visitors.Visitor;

public class Router extends Modem{
    @Override
    public void accept(Visitor visitor) {
        try {
            visitor.getClass().getMethod("visit", this.getClass()).invoke(visitor, this);
        } catch (Exception e) {
            throw new UnsupportedOperationException("No visit (Router) method in modem: " + visitor.getClass().getSimpleName(), e);
        }
    }

    public void enableFirewall(){
        System.out.println("Router firewall enabled");
    }
}
