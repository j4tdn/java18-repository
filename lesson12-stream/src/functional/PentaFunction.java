package functional;

public interface PentaFunction<T, U, S, M, R> {
	R apply(T t, U u, S s, M m);
}