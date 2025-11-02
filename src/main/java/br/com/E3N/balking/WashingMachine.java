package br.com.E3N.balking;

import java.util.concurrent.TimeUnit;

public class WashingMachine {

    private final DelayProvider delayProvider;
    private WashingMachineState state;

    public WashingMachine(DelayProvider delayProvider) {
        this.delayProvider = delayProvider;
        this.state = WashingMachineState.ENABLED;
    }

    public WashingMachineState getState(){
        return state;
    }

    public void wash(){
        synchronized (this){
            var machineState = getState();
            System.out.printf("Actual machine state: %s : %s %n", Thread.currentThread().getName(), machineState);
            if (this.state.equals(WashingMachineState.WASHING)){
                System.out.println("THE MACHINE IS ALREADY WORKING");
                return;
            }
            this.state = WashingMachineState.WASHING;
        }
        System.out.printf("Washing whatever it is: %s : %s %n", Thread.currentThread().getName(), state);
        this.delayProvider.executeAfterDelay(50, TimeUnit.MILLISECONDS, this::endOfWashing);
    }

    public synchronized void endOfWashing(){
        state = WashingMachineState.ENABLED;
        System.out.printf("Washing completed: %s : %s ", Thread.currentThread().getName(), state);
    }

}
