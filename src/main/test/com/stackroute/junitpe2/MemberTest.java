package com.stackroute.junitpe2;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberTest {


    public static Member member;
    public static Member.Membervariable membervariable;

    @Before
    public  void setUp()
    {
        member = new Member();
        membervariable = member.new Membervariable();
    }

    @After
    public  void tearDown()
    {
        member = null;
        membervariable = null;
    }

    @Test
    public void testForSetMember()
    {
        Member member1 = membervariable.setMember("ravali", 22, 34);
        assertEquals(member1.name, "ravali");
        assertEquals(member1.age, 22);
        assertEquals(member1.salary, 34,0);
    }

    @Test
    public void testForSetMemberGivingDoubleValue()
    {
        Member member1 = membervariable.setMember("shailendra", 21, 3.60);
        assertEquals(member1.name, "shailendra");
        assertEquals(member1.age, 21);
        assertEquals(member1.salary, 3,60);
    }

    @Test
    public void testForSetMemberGivingNullValue()
    {
        Member member1 = membervariable.setMember(null, 0, 0.60);
        assertEquals(member1.name, null);
        assertEquals(member1.age, 0);
        assertEquals(member1.salary, 0,60);
    }
}

