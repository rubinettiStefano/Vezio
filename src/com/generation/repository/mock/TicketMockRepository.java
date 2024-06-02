package com.generation.repository.mock;

import java.util.ArrayList;
import java.util.List;

import com.generation.model.Ticket;
import com.generation.repository.abstraction.BaseRepository;
import com.generation.repository.abstraction.IRepository;

public class TicketMockRepository extends BaseRepository implements IRepository<Ticket> 
{
     @Override
    public List<Ticket> selectAll() {
        return new ArrayList<>(tickets);
    }

    @Override
    public void insert(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public void update(Ticket ticket) {
        int index = findIndexById(ticket.getId());
        if (index != -1) {
            tickets.set(index, ticket);
        }
    }

    @Override
    public void delete(Ticket ticket) {
        tickets.remove(ticket);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            tickets.remove(index);
        }
    }

    private int findIndexById(int id) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
