package br.com.E3N.abstractDocument;

import br.com.E3N.abstractDocument.service.Document;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class AbstractDocument implements Document {

    private final Map<String, Object> properties;

    protected AbstractDocument(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties must no be null");
        this.properties = properties;
    }

    @Override
    public void put(String key, Object object) {
        this.properties.put(key, object);
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        return Stream.ofNullable(get(key))
                .filter(Objects::nonNull)
                .map(el -> (List<Map<String, Object>>) el )
                .findAny()
                .stream()
                .flatMap(Collection::stream)
                .map(constructor);
    }
}
