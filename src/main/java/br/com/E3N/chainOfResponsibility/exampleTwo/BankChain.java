package br.com.E3N.chainOfResponsibility.exampleTwo;

/**
 * accordingly to the GOF definition the pattern chain of responsibilities the handlers
 * are attached to each other using a 'next' attribute
 * so if the current object cannot handle the request it will call the next one
 * if there is no next an exception will be thrown
 */
public abstract class BankChain {
    private final IdBanks identifier;
    private BankChain next;

    public BankChain(IdBanks identifier) {
        next = null;
        this.identifier = identifier;
    }

    public void setNext(BankChain link) {
        if (this.next == null) {
            this.next = link;
        } else {
            this.next.setNext(link);
        }
    }

    public boolean canPay(IdBanks identifier) {
        return this.identifier.equals(identifier);
    }

    public void pay(final IdBanks idBank) {
        if (canPay(idBank)) {
            paying();
        } else if (next != null) {
            next.pay(idBank);
        } else {
          throw new RuntimeException("There is no handler for this request");
        }
    }

    protected abstract void paying();

    public IdBanks getIdentifier() {
        return identifier;
    }
}
