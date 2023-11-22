package vn.edu.iuh.fit.repositories;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public abstract class AbstractRepository<T, ID> {
    private DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public AbstractRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public abstract void insert(T t);
    public abstract void update(T t);
    public abstract void delete(ID id);
    public abstract Optional<T> findById(ID id);
    public abstract List<T> findAll();

}