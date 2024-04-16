package PolimorfismoEmpresa;

public class EmpregadoAssalariadoComissionadoBonificado extends Empregado {
    public EmpregadoAssalariadoComissionadoBonificado(int tipo, double salario, double comissao, double bonus, double horasTrabalhadas, double valorHora, double numeroDeTarefas, double valorTarefa){
        super(tipo,salario,comissao,bonus,horasTrabalhadas,valorHora,numeroDeTarefas,valorTarefa);

    }
    @Override
    public double calculaSalario() {
        return ((getSalario()/100) * getComissao()) + getSalario() + getBonus();
    }
}
