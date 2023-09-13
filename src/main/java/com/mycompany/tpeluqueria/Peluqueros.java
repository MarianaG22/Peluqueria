package com.mycompany.tpeluqueria;

import javax.swing.JOptionPane;

public class Peluqueros{

    private int numeroCortesCaballeros;
    private double valorCortesCaballeros;
    private final double precioCorteCaballero = 8000;

    private int numeroCortesDamas;
    private double valorCortesDamas;
    private final double precioCorteDama = 10500;

    private int numeroTinturas;
    private double valorTinturas;
    private final double precioTintura = 40000;

    private int numeroPeinados;
    private double valorPeinados;
    private final double precioPeinado = 15000;

    private int totalServicios;
    private double totalRecaudado;

    public Peluqueros() {
    }
    
    public int getNumeroCortesCaballeros() {
        return numeroCortesCaballeros;
    }

    public void setNumeroCortesCaballeros(int numeroCortesCaballeros) {
        this.numeroCortesCaballeros = numeroCortesCaballeros;
    }

    public double getValorCortesCaballeros() {
        return valorCortesCaballeros;
    }

    public void setValorCortesCaballeros(double valorCortesCaballeros) {
        this.valorCortesCaballeros = valorCortesCaballeros;
    }

    public int getNumeroCortesDamas() {
        return numeroCortesDamas;
    }

    public void setNumeroCortesDamas(int numeroCortesDamas) {
        this.numeroCortesDamas = numeroCortesDamas;
    }

    public double getValorCortesDamas() {
        return valorCortesDamas;
    }

    public void setValorCortesDamas(double valorCortesDamas) {
        this.valorCortesDamas = valorCortesDamas;
    }

    public int getNumeroTinturas() {
        return numeroTinturas;
    }

    public void setNumeroTinturas(int numeroTinturas) {
        this.numeroTinturas = numeroTinturas;
    }

    public double getValorTinturas() {
        return valorTinturas;
    }

    public void setValorTinturas(double valorTinturas) {
        this.valorTinturas = valorTinturas;
    }

    public int getNumeroPeinados() {
        return numeroPeinados;
    }

    public void setNumeroPeinados(int numeroPeinados) {
        this.numeroPeinados = numeroPeinados;
    }

    public double getValorPeinados() {
        return valorPeinados;
    }

    public void setValorPeinados(double valorPeinados) {
        this.valorPeinados = valorPeinados;
    }

    public int getTotalSevicios() {
        return totalServicios;
    }

    public void setTotalSevicios(int totalSevicios) {
        this.totalServicios = totalSevicios;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public void calcularServicios() {

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el servicio:"
                + "\n 1. Corte Caballero \n 2. Corte Dama \n 3. Tintura Cabello \n 4. Peinado"));
        switch (op) {
            case 1 -> {
                numeroCortesCaballeros++;
                valorCortesCaballeros += precioCorteCaballero;
            }
            case 2 -> {
                numeroCortesDamas++;
                valorCortesDamas += precioCorteDama;
            }
            case 3 -> {
                numeroTinturas++;
                valorTinturas += precioTintura;
            }
            case 4 -> {
                numeroPeinados++;
                valorPeinados += precioPeinado;
            }
            default -> JOptionPane.showMessageDialog(null, "Numero no valido", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        totalServicios = numeroCortesCaballeros + numeroCortesDamas + numeroTinturas + numeroPeinados;
        totalRecaudado = valorCortesCaballeros + valorCortesDamas + valorTinturas + valorPeinados;
    }
}
