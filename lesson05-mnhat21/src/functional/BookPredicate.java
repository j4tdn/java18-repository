package functional;

import bean.Book;

public interface BookPredicate {
	boolean test(Book book);
}
