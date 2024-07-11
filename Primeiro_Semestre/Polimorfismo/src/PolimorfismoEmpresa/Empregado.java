package PolimorfismoEmpresa;

public class Empregado {
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    private double horasTrabalhadas;
    private double valorHora;

    private double numeroDeTarefas;


    private double valorTarefa;

    public Empregado(int tipo, double salario, double comissao, double bonus, double horasTrabalhadas, double valorHora, double numeroDeTarefas, double valorTarefa) {
        this.tipo = tipo;
        this.salario = salario;
        this.comissao = comissao;
        this.bonus = bonus;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.numeroDeTarefas = numeroDeTarefas;
        this.valorTarefa = valorTarefa;
    }

//getters/setters

    public double getNumeroDeTarefas() {
        return numeroDeTarefas;
    }

    public double getValorTarefa() {
        return valorTarefa;
    }

    public double getBonus() {
        return bonus;
    }

    public double getComissao() {
        return comissao;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getSalario() {
        return salario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getTipo() {
        return tipo;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setNumeroDeTarefas(double numeroDeTarefas) {
        this.numeroDeTarefas = numeroDeTarefas;
    }

    public void setValorTarefa(double valorTarefa) {
        this.valorTarefa = valorTarefa;
    }
}
