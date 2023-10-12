public abstract class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void adicionar(Departamento departamento);

    public abstract void remover(Departamento departamento);
}