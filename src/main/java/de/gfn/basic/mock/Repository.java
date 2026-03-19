package de.gfn.basic.mock;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    List<T> findAll();

    Optional<T> findById(long id);

    boolean insert(T t);

    boolean update(T t);

    boolean delete(T t);

    boolean deleteById(long id);

}
