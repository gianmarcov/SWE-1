package ch.team2.kundenverwaltung.persistence;

import java.util.List;

public interface DaoCustomer {
	void insert(final Customer customer);
	Customer select(final int index);
	List<Customer> select();
	void delete(final int index);
}
