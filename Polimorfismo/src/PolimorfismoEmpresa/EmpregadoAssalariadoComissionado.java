package PolimorfismoEmpresa;

public class EmpregadoAssalariadoComissionado extends Empregado {
    private double salario;
    private double comissao;
    public EmpregadoAssalariadoComissionado(int tipo, double salario, double comissao, double bonus, double horasTrabalhadas, double valorHora, double numeroDeTarefas, double valorTarefa) {
        super(tipo,salario,comissao,bonus,horasTrabalhadas,valorHora,numeroDeTarefas,valorTarefa);
        this.salario = salario;
        this.comissao = comissao;
    }

    public double calculaSalario() {
        return ((this.getSalario()/100) * getComissao()) + getSalario();
    }
}
