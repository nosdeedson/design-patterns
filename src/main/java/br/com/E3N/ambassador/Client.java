package br.com.E3N.ambassador;

public class Client {
    private final ServiceAmbassador serviceAmbassador = new ServiceAmbassador();

    public void useService(final int value) throws Exception {
        var result = serviceAmbassador.doRemoteFunction(value);
        System.out.printf("Service result: [%d]%n", result);
    }
}
