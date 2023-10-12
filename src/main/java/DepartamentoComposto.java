import java.util.ArrayList;
import java.util.List;

public class DepartamentoComposto extends Departamento {
    private List<Departamento> subDepartamentos = new ArrayList<>();

    public DepartamentoComposto(String nome) {
        super(nome);
    }

    @Override
    public void adicionar(Departamento departamento) {
        subDepartamentos.add(departamento);
    }

    @Override
    public void remover(Departamento departamento) {
        subDepartamentos.remove(departamento);
    }
}