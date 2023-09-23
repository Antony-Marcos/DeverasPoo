package Entidades;

public class Main {
    public static void main(String[] args) {
        Curso d1 = new Curso("Poo");
        Professor p1 = new Professor("Julius");
        p1.addCurso(d1);
        p1.addCurso(new Curso("aps"));
        p1.addCurso(new Curso("Pi3"));

        Professor p2 = new Professor("Daniel");
        p2.addCurso(d1);
    }
}
