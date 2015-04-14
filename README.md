# Demonstration for bug spring-boot-2811

This project has an interface `NumberPrinter` that is required by
`SpringBoot2811AutoConfiguration`. I have two beans, one that's
implemented as an inline anonymous class, and one that's a
Spring Integration service gateway. If the profile setting
in the `application.properties` is active, the anonymous class
is registered as a bean, the `@ConditionalOnBean` matches, and
the context startup fails because of having two beans. If the
profile is commented out, the container fails to match the
gateway bean, and the condition does not activate, even though
the gateway bean is subsequently still registered.
