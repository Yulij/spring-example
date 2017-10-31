package by.academy.it.rest.dao;

import java.util.List;

/**
 * Created by yslabko on 024 24 мар 2015.
 */
public interface PersonDao<T> extends Dao<T> {
    List<T> getPersons();
}
