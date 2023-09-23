package Entidades;
import java.util.ArrayList;

public class Professor {

    private String nome;
    private ArrayList<Curso> cursos;

public Professor(String nome){
this.nome = nome;
this.cursos = null;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    public void addCurso(Curso curso){
    if(cursos == null){

        cursos = new ArrayList<>();

        if (curso.getProfessor() == null){

            this.cursos.add(curso);
            curso.setProfessor(this);
            System.out.println("Disciplina adicionada com sucesso");
        } else{
            System.out.println("Já tem professor ai meu chapa");
        }
    }
    }
}
