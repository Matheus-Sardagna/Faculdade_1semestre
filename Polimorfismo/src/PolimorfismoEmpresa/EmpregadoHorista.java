package PolimorfismoEmpresa;

public class EmpregadoHorista extends Empregado{
    private double valorHora;
    private int numeroHoras;

    public EmpregadoHorista(int tipo, double salario, double comissao, double bonus, double horasTrabalhadas, double valorHora, double numeroDeTarefas, double valorTarefa,int numeroHoras){
        super(tipo, salario, comissao, bonus, horasTrabalhadas,valorHora,numeroDeTarefas,valorTarefa);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }
    @Override
    public double calculaSalario() {
        return this.valorHora * this.numeroHoras;
    }

}
