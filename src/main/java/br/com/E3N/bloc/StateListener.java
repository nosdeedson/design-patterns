package br.com.E3N.bloc;

public interface StateListener<T> {
    void onStateChange(T state);
}
