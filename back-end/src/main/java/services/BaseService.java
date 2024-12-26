package services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseService <T, ID> {
    protected abstract JpaRepository<T, ID> getRepository();

    public List<T> findAll() {
        return getRepository().findAll();
    }

    public Optional<T> findById(ID id) {
        return getRepository().findById(id);
    }

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public T update(ID id, T entityDetails) {
        return getRepository().findById(id)
                .map(existingEntity -> updateEntity(existingEntity, entityDetails))
                .orElseThrow(() -> new IllegalArgumentException("entity with ID: " + id + " not found."));
    }

    public void delete(ID id) {
        getRepository().deleteById(id);
    }

    protected T updateEntity(T existingEntity, T entityDetails) {
        throw new UnsupportedOperationException("Update operation not implemented");
    }


}
