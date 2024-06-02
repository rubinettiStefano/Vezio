package com.generation.repository.mock;

import java.util.ArrayList;
import java.util.List;

import com.generation.model.Employee;
import com.generation.model.Visitor;
import com.generation.repository.abstraction.BaseRepository;
import com.generation.repository.abstraction.IRepository;

public class VisitMockRepository extends BaseRepository implements IRepository<Visitor> 
{
    @Override
    public List<Visitor> selectAll() {
        return new ArrayList<>(visitors);
    }

    @Override
    public void insert(Visitor visitor) {
        visitors.add(visitor);
    }

    @Override
    public void update(Visitor visitor) {
        int index = findIndexById(visitor.getId());
        if (index != -1) {
            visitors.set(index, visitor);
        }
    }

    @Override
    public void delete(Visitor visitor) {
        visitors.remove(visitor);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            visitors.remove(index);
        }
    }

    private int findIndexById(int id) {
        for (int i = 0; i < visitors.size(); i++) {
            if (visitors.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
