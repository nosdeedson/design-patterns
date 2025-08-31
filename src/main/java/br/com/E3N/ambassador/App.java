package br.com.E3N.ambassador;

public class App {

    public static void execute(int value, int value2) throws Exception {
        int[] values = new int[3];
        for (int i = 0; i < 3; i++) {
            values[i] = (int) (Math.random() * 301);
        }
        var host1 = new Client();
        var host2 = new Client();
        var host3 = new Client();
        host1.useService(values[0]);
        host2.useService(values[1]);
        host3.useService(values[2]);
    }
}
