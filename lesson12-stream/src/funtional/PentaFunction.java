package funtional;

/**
 * converts 4 parameter to return <R> type
 */
@FunctionalInterface
public interface PentaFunction<T, U, S, M, R> {
	R apply(T t, U u, S s, R r ,M m);
}
