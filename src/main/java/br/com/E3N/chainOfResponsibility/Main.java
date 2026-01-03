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
