package br.com.E3N.chainOfResponsibility;

import br.com.E3N.chainOfResponsibility.exampleOne.MakeRequest;
import br.com.E3N.chainOfResponsibility.exampleOne.OrcKing;
import br.com.E3N.chainOfResponsibility.exampleOne.Request;
import br.com.E3N.chainOfResponsibility.exampleOne.RequestType;
import br.com.E3N.chainOfResponsibility.exampleTwo.BankA;
import br.com.E3N.chainOfResponsibility.exampleTwo.BankB;
import br.com.E3N.chainOfResponsibility.exampleTwo.GetBanks;
import br.com.E3N.chainOfResponsibility.exampleTwo.IdBanks;

public class Main {
    public static void main(String[] args) {
        /**
         * The Chain of Responsibility pattern create links between objects
         * and which object has its own capability to process something.
         * so, when a sender sends a request, the request will go through the chain
         * and which objects in the chain will check if it can process the request
         * if not it will call the next object until the last one,
         * if at the end any object was capable to process the request an exception will be thrown.
         * if one of the objects is capable of processing the request, this will be done.
         * The chain of responsibility pattern is always confused of the pipeline pattern. The first one is about
         * finding the right handle to process a request while the second is about each step of the flow handle a
         * little part of the request.
         */
        System.out.println("Fist example.");
        var king = new OrcKing();
        MakeRequest makeRequest = new MakeRequest(king);
        makeRequest.makeRequest(new Request(RequestType.COLLECT_TAX, "Collect Tax"));
        makeRequest.makeRequest(new Request(RequestType.DEFEND_CASTLE, "Defend the castle"));
        makeRequest.makeRequest(new Request(RequestType.TORTURE_PRISONER, "Torture prisoner"));
        System.out.println("Second example.");
        var banks = GetBanks.getBanks();
        banks.pay(IdBanks.BANK_C);
        banks.pay(IdBanks.BANK_D);
        banks.pay(IdBanks.BANK_A);
        banks.pay(IdBanks.BANK_B);
        banks.pay(IdBanks.BANK_A);

    }
}
