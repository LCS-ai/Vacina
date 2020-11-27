package paciente;

public class Paciente implements Comparable<Paciente> {

    private String nome;
    private int idade;
    private boolean vacinado;

    public int compareTo(Paciente p) {
        if (this.idade > p.getIdade()) {
            return -1;
        } else if (this.idade < p.getIdade()) {
            return 1;
        }
        return 0;
    }

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.vacinado = false;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean getVacinado() {
        return this.vacinado;
    }

    public void vacinando() {
        this.vacinado = true;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nIdade: " + getIdade();
    }

}