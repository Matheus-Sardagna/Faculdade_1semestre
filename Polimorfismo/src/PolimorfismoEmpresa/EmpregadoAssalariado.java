package PolimorfismoEmpresa;

public class EmpregadoAssalariado {
    private double salario;
    public EmpregadoAssalariado(int tipo, double salario, double comissao, double bonus, double horasTrabalhadas, double valorHora, double numeroDeTarefas, double valorTarefa){
        this.salario = salario;
        super(tipo,salario,comissao,bonus,horasTrabalhadas,valorHora,numeroDeTarefas,valorTarefa);

    }
}
