package oopPrinciples.inheritance;

public class DemoInheritance {
    public static void main(String[] args)
    {
        Manager mgr = new Manager();

        mgr.setId(1L);
        mgr.setFirstName("Vahid");
        mgr.setLastName("Alizadeh");

        System.out.println(mgr);
    }
}
