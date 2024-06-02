package com.generation.repository.abstraction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.generation.model.Employee;
import com.generation.model.Ticket;
import com.generation.model.Visitor;

public abstract class BaseRepository 
{
    protected List<Employee> employees = new ArrayList<>();
    protected List<Visitor> visitors = new ArrayList<>();
    protected List<Ticket> tickets = new ArrayList<>();

    
    public BaseRepository() {

        employees.add(new Employee(1, "John", "Doe", "DOEJOH60A01H501A", 3000));
        employees.add(new Employee(2, "Jane", "Smith", "SMTJNE80A02H501B", 3200));
        employees.add(new Employee(3, "Michael", "Johnson", "JHNMCH70A03H501C", 3100));
        employees.add(new Employee(4, "Emily", "Davis", "DSEMIL90A04H501D", 3300));
        employees.add(new Employee(5, "David", "Brown", "BRNDVD85A05H501E", 3400));

        visitors.add(new Visitor(1, "Alice", "Johnson", "AJN60A01H501F", "BG", "City1", "Engineer", LocalDate.of(1985, 1, 1), true));
        visitors.add(new Visitor(2, "Bob", "Williams", "BWL70A02H502G", "BS", "City2", "Doctor", LocalDate.of(1990, 2, 2), false));
        visitors.add(new Visitor(3, "Charlie", "Brown", "CBN80A03H503H", "CO", "City3", "Teacher", LocalDate.of(1980, 3, 3), true));
        visitors.add(new Visitor(4, "Daisy", "Miller", "DML90A04H504I", "CR", "City4", "Student", LocalDate.of(1995, 4, 4), false));
        visitors.add(new Visitor(5, "Edward", "Jones", "EJN85A05H505J", "LC", "Perledo", "Musician", LocalDate.of(1988, 5, 5), true));
        visitors.add(new Visitor(6, "Fiona", "Garcia", "FGA75A06H506K", "LO", "City6", "Nurse", LocalDate.of(1975, 6, 6), false));
        visitors.add(new Visitor(7, "George", "Martinez", "GMR65A07H507L", "MN", "City7", "Writer", LocalDate.of(1965, 7, 7), true));
        visitors.add(new Visitor(8, "Hannah", "Lopez", "HLO55A08H508M", "MI", "City8", "Student", LocalDate.of(1955, 8, 8), false));
        visitors.add(new Visitor(9, "Ian", "Clark", "ICL45A09H509N", "MB", "City9", "Pilot", LocalDate.of(1945, 9, 9), true));
        visitors.add(new Visitor(10, "Jane", "Lewis", "JLW35A10H510O", "PV", "City10", "Scientist", LocalDate.of(1935, 10, 10), false));
        visitors.add(new Visitor(11, "Kevin", "Walker", "KWL25A11H511P", "BG", "City11", "Teacher", LocalDate.of(1925, 11, 11), true));
        visitors.add(new Visitor(12, "Lily", "Hall", "LHL15A12H512Q", "BS", "City12", "Accountant", LocalDate.of(1915, 12, 12), false));
        visitors.add(new Visitor(13, "Mike", "Allen", "MAL05A13H513R", "CO", "City13", "Firefighter", LocalDate.of(2005, 1, 13), true));
        visitors.add(new Visitor(14, "Nina", "Young", "NYO95A14H514S", "CR", "City14", "Police Officer", LocalDate.of(1995, 2, 14), false));
        visitors.add(new Visitor(15, "Oliver", "King", "OKI85A15H515T", "LC", "City15", "Teacher", LocalDate.of(1985, 3, 15), true));
        visitors.add(new Visitor(16, "Paula", "Scott", "PSC75A16H516U", "LO", "City16", "Student", LocalDate.of(1975, 4, 16), false));
        visitors.add(new Visitor(17, "Quinn", "Adams", "QAD65A17H517V", "MN", "City17", "Pharmacist", LocalDate.of(1965, 5, 17), true));
        visitors.add(new Visitor(18, "Rachel", "Nelson", "RNE55A18H518W", "MI", "City18", "Veterinarian", LocalDate.of(1955, 6, 18), false));
        visitors.add(new Visitor(19, "Sam", "Harris", "SHA45A19H519X", "MB", "City19", "Teacher", LocalDate.of(1945, 7, 19), true));
        visitors.add(new Visitor(20, "Tina", "Roberts", "TRO35A20H520Y", "PV", "City20", "Artist", LocalDate.of(1935, 8, 20), false));

        visitors.add(new Visitor(21, "Ulysses", "Moore", "UMO07A01H521Z", "BG", "City21", "Student", LocalDate.of(2007, 1, 1), true));
        visitors.add(new Visitor(22, "Violet", "Parker", "VPA08A02H522A", "BS", "City22", "Student", LocalDate.of(2008, 2, 2), false));
        visitors.add(new Visitor(23, "Wendy", "King", "WKI09A03H523B", "CO", "City23", "Student", LocalDate.of(2009, 3, 3), true));
        visitors.add(new Visitor(24, "Xander", "Lee", "XLE10A04H524C", "CR", "City24", "Student", LocalDate.of(2010, 4, 4), false));
        visitors.add(new Visitor(25, "Yara", "Kim", "YKI11A05H525D", "LC", "City25", "Student", LocalDate.of(2011, 5, 5), true));

        visitors.add(new Visitor(26, "Zane", "Howard", "ZHO12A06H526E", "LO", "City26", "Artist", LocalDate.of(1980, 6, 6), false));
        visitors.add(new Visitor(27, "Ava", "Green", "AGR13A07H527F", "MN", "City27", "Doctor", LocalDate.of(1975, 7, 7), true));
        visitors.add(new Visitor(28, "Blake", "Scott", "BSC14A08H528G", "MI", "City28", "Engineer", LocalDate.of(1990, 8, 8), false));
        visitors.add(new Visitor(29, "Cora", "Harris", "CHA15A09H529H", "MB", "City29", "Nurse", LocalDate.of(1985, 9, 9), true));
        visitors.add(new Visitor(30, "Dylan", "Walker", "DWA16A10H530I", "PV", "City30", "Lawyer", LocalDate.of(1980, 10, 10), false));

        for (int i = 0; i < 60; i++) {
            Employee employee = employees.get(i % employees.size());
            Visitor visitor = visitors.get(i % 25); 
            Ticket ticket = new Ticket(i + 1, i % 3==0 ? "FULL" :  i % 3==1 ? "GARDEN" : "CASTLE", visitor, employee);
            visitor.addTicket(ticket);
            employee.addTicket(ticket);
            tickets.add(ticket);
        }
    }
}
