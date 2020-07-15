public class Mediator {
B b;
C c;

public void callP(){
        b.p();
    }

    public void callQ(){
    c.q();
    }

    public void callR(){
    c.r();
    }

}

class A{
    Mediator m;

    public void m(){
        System.out.println("A m");
        m.callP();
    }

    public void n(){
        m.callQ();
    }
}

class B{
    Mediator m;

    public void p(){
        System.out.println("B p");
        m.callQ();
    }
}

class C{
    Mediator m;

    public void q(){
        System.out.println("C q");
    }

    public void r(){
        System.out.println("C r");
    }
}

class Test{
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        A a=new A();
        B b=new B();
        C c=new C();

        mediator.b =b;
        mediator.c =c;

        a.m=mediator;
        b.m=mediator;
        c.m=mediator;

        a.m();
        a.n();
        b.p();
        c.q();
        c.r();
    }
}
