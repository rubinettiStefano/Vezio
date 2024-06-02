package com.generation.repository.abstraction;

import java.util.List;

public interface IRepository<X>
{
    List<X> selectAll();
    void insert(X x);
    void update(X x);
    void delete(X x);
    void delete(int id);
}
