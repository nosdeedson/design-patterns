package br.com.E3N.abstractDocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Document {
    Void put(final String key, Object object);
    Object get(final String key);
    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
