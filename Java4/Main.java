public class Main {
    public static void main(String[] args) {

        Facultymembers facultymembers = new Facultymembers();
        Departments departments = new Departments();
        MemofDepartaments memofDepartaments = new MemofDepartaments();
        Connect connect = new Connect();

        facultymembers.setNameF("Скрыпников Алексей васильевич");

        departments.setDep("Информационной безопасности");

        String deport = departments.getDep();
        memofDepartaments.setDeport(deport);

        memofDepartaments.setName("Скрыпников Алексей васильевич");
        memofDepartaments.setDol("Профессор");
        memofDepartaments.setPred("Информатика");

        System.out.println(facultymembers.toString());
        System.out.println(departments.toString());
        System.out.println(memofDepartaments.toString());

    }
}