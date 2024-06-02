package com.generation.repository.mock;

import java.util.ArrayList;
import java.util.List;

import com.generation.model.Employee;
import com.generation.model.Visitor;
import com.generation.repository.abstraction.BaseRepository;
import com.generation.repository.abstraction.IRepository;

public class EmployeeMockRepository extends BaseRepository implements IRepository<Employee> 
{
     @Override
    public List<Employee> selectAll() {
        return new ArrayList<>(employees);
    }

    @Override
    public void insert(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void update(Employee employee) {
        int index = findIndexById(employee.getId());
        if (index != -1) {
            employees.set(index, employee);
        }
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            employees.remove(index);
        }
    }

    private int findIndexById(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
