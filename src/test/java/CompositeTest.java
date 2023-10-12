import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CompositeTest {
    @Test
    void testEstruturaDepartamentos() {
        Departamento departamentoRaiz = new DepartamentoComposto("CEO");
        Departamento departamentoTI = new DepartamentoComposto("TI");
        Departamento departamentoVendas = new DepartamentoComposto("Vendas");
        Departamento departamentoRH = new DepartamentoComposto("RH");
        Departamento departamentoDesenvolvimento = new DepartamentoComposto("Desenvolvimento");
        Departamento departamentoSuporte = new DepartamentoComposto("Suporte");
        Departamento departamentoFinanceiro = new DepartamentoSimples("Financeiro");

        departamentoRaiz.adicionar(departamentoTI);
        departamentoRaiz.adicionar(departamentoVendas);
        departamentoRaiz.adicionar(departamentoRH);

        departamentoTI.adicionar(departamentoDesenvolvimento);
        departamentoTI.adicionar(departamentoSuporte);

        departamentoRH.adicionar(departamentoFinanceiro);

        assertEquals("CEO", departamentoRaiz.getNome());
        assertEquals("TI", departamentoTI.getNome());
        assertEquals("Vendas", departamentoVendas.getNome());
        assertEquals("RH", departamentoRH.getNome());
        assertEquals("Desenvolvimento", departamentoDesenvolvimento.getNome());
        assertEquals("Suporte", departamentoSuporte.getNome());
        assertEquals("Financeiro", departamentoFinanceiro.getNome());

        departamentoRaiz.remover(departamentoTI);
        assertEquals("CEO", departamentoRaiz.getNome());
        assertEquals("RH", departamentoRH.getNome());
        assertEquals("Financeiro", departamentoFinanceiro.getNome());
    }
}
