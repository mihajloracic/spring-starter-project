package tech.thursday.tech.generics;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;


public abstract class BaseService<T,ID extends Serializable> implements Serializable{

    protected JpaRepository<T,ID> jpaRepository;

    public List<T> findAll() {
        return jpaRepository.findAll();
    }

    public List<T> findAll(Sort sort) {
        return jpaRepository.findAll(sort);
    }


    public T save(T t){
        return jpaRepository.save(t);
    }

 

    public void flush() {
        jpaRepository.flush();
    }

    public <S extends T> S saveAndFlush(S item) {
        return jpaRepository.saveAndFlush(item);
    }

    public void deleteInBatch(Iterable<T> params) {
        jpaRepository.deleteInBatch(params);
    }

    public void deleteAllInBatch() {
        jpaRepository.deleteAllInBatch();
    }

    public T getOne(ID id) {
        return jpaRepository.getOne(id);
    }

    public <S extends T> List<S> findAll(Example<S> params) {
        return jpaRepository.findAll(params);
    }

    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        return jpaRepository.findAll(example, sort);
    }

    Page<T> findAll(Pageable page){
        return jpaRepository.findAll(page);
    }

    protected void setEntity(JpaRepository repository) {
        this.jpaRepository = repository;
    }
}