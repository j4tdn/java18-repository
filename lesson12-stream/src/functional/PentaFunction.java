package functional;

/**
 * PentaFunction converts 4 parameter to return <R> type
 * 
 * @author qphan
 * 
 */
public interface PentaFunction<T, U, S, M, R> {
	R apply(T t, U u, S s, M m);
}