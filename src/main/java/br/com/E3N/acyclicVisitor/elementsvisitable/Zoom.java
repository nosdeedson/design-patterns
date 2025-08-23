package br.com.E3N.acyclicVisitor.elementsvisitable;

import br.com.E3N.acyclicVisitor.visitors.Visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Zoom extends Modem {
    @Override
    public void accept(Visitor visitor) {
        try {
            Method method = visitor.getClass().getMethod("visit", Zoom.class);
            try {
                method.invoke(visitor, this);
            } catch (IllegalAccessException e) {
                // Try to access even if private/local class
                method.setAccessible(true);
                method.invoke(visitor, this);
            }
        } catch (NoSuchMethodException e) {
            // ✅ Just throw — DO NOT PRINT HERE
            throw new UnsupportedOperationException(
                    "No visit(Zoom) method in visitor: " + visitor.getClass().getSimpleName()
            );
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Error during visit(Zoom)", e.getCause());
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error visiting Zoom", e);
        }
    }

    public void dial() {
        System.out.println("Zoom connection created.");
    }
}
