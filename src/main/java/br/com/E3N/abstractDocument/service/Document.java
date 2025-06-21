package br.com.E3N.abstractDocument.service;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Document {
    void put(final String key, Object object);
    Object get(final String key);
    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
