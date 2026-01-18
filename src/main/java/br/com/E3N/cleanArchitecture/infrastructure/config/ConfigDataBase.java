package br.com.E3N.cleanArchitecture.infrastructure.config;

/**
 * this package is for configuration of the system
 * like database configuration and this file is just one example where these kind of things have to be
 * the package infrastructure can be named as adapters too, because infrastructure and adapters are the
 * places where we put the classes that know how to do.
 * the domain package contains the business domain
 * the application package (use cases) contains the business rules, business flow
 */
public record ConfigDataBase() {
}
