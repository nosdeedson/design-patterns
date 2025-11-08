package br.com.E3N.bloc;

import javax.swing.*;
import java.awt.*;

public class BlocUI {
    final Bloc bloc = new Bloc();

    public void createAndShowUI(){
        JFrame frame = new JFrame("Bloc example");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel counterLabel = new JLabel("Counter1: 0", SwingConstants.CENTER);
        counterLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JButton decrementButton = new JButton("Decrement");
        JButton toggleListenerButton = new JButton("Disable Listener");
        JButton incrementButton = new JButton("Increment");

        frame.setLayout(new BorderLayout());
        frame.add(counterLabel, BorderLayout.CENTER);
        frame.add(incrementButton, BorderLayout.NORTH);
        frame.add(decrementButton, BorderLayout.SOUTH);
        frame.add(toggleListenerButton, BorderLayout.EAST);

        StateListener<State> stateStateListener = state -> counterLabel.setText("Counter: " + state.value());
        bloc.addListener(stateStateListener);
        toggleListenerButton.addActionListener(
                e -> {
                    if (bloc.getListeners().contains(stateStateListener)){
                        bloc.removeListener(stateStateListener);
                        toggleListenerButton.setText("Enable Listener");
                    } else {
                        bloc.addListener(stateStateListener);
                        toggleListenerButton.setText("Disable Listener");
                    }
                }
        );

        incrementButton.addActionListener(e -> bloc.increment());
        decrementButton.addActionListener(e -> bloc.decrement());
        frame.setVisible(true);

    }
}