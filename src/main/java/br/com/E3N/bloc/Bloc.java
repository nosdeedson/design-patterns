package br.com.E3N.bloc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bloc implements  ListenerManager<State>{
    private State state;
    private final List<StateListener<State>> listeners = new ArrayList<>();

    public Bloc() {
        this.state = new State(0);
    }

    @Override
    public void addListener(StateListener<State> listener) {
        this.listeners.add(listener);
        listener.onStateChange(state);
    }

    @Override
    public void removeListener(StateListener<State> listener) {
        this.listeners.remove(listener);
    }

    @Override
    public List<StateListener<State>> getListeners() {
        return Collections.unmodifiableList(listeners);
    }

    private void emitState(State newState){
        this.state = newState;
        for (StateListener<State> listener: listeners){
            listener.onStateChange(this.state);
        }
    }

    public void increment(){
        emitState(new State(this.state.value() + 1));
    }

    public void decrement(){
        emitState(new State(this.state.value() - 1));
    }
}
