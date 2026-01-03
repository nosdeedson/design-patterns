package br.com.E3N.chainOfResponsibility.exampleTwo;

public final class GetBanks {
    public static BankChain getBanks(){
        BankChain banks = new BankA(IdBanks.BANK_A);
        banks.setNext(new BankB(IdBanks.BANK_B));
        banks.setNext(new BankC(IdBanks.BANK_C));
        banks.setNext(new BankD(IdBanks.BANK_D));
        return  banks;
    }
}
