package com.stackroute.junitpe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {


    public static Employee emp;
    public static Employee.Employeevariable empvariable;

    @BeforeClass
    public static void setUp() {
        emp = new Employee();
        empvariable = emp.new Employeevariable();
    }

    @AfterClass
    public static void tearDown() {
        emp = null;
        empvariable = null;
    }

    @Test
    public void testForSetMember() {
        Employee emp1 = empvariable.setMember("Ravali", 22, 34);
        assertEquals(emp1.name, "Ravali");
        assertEquals(emp1.age, 22);
        assertEquals(emp1.salary, 34, 0);
    }

    @Test
    public void testForSetMemberGivingDoubleValue() {

            Employee emp1 = empvariable.setMember("Srujana", 21, 3.60);
            assertEquals(emp1.name, "Srujana");
            assertEquals(emp1.age, 21);
            assertEquals(emp1.salary, 3.60, 0);
        }


        @Test
        public void testForSetMemberGivingNullValue()
        {
            Employee emp1 = empvariable.setMember(null, 0, 0.60);
            assertEquals(emp1.name, null);
            assertEquals(emp1.age, 0);
            assertEquals(emp1.salary, 0,60);
        }
    }
