package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class Imc2 {

	public static void main(String[] args) {

		String nome, stRaltura, strPeso;
		double altura, peso, imc;

		nome = JOptionPane.showInputDialog("Qual o seu nome?");

		strPeso = JOptionPane.showInputDialog("Qual o seu peso?");
		peso = Double.parseDouble(strPeso);

		stRaltura = JOptionPane.showInputDialog("Qual sua altura em Metros?");
		altura = Double.parseDouble(stRaltura);

		imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Olá " + nome + " você está abaixo do peso!");
			} else if (imc >= 18.5 && imc < 25.0) {
				JOptionPane.showMessageDialog(null, "Olá " + nome + " você está no peso ideal!");
			} else if (imc >= 25.0 && imc < 30.0){
				JOptionPane.showMessageDialog(null, "Olá " + nome + " você está com sobrepeso!");
			} else if (imc >= 30.0 && imc < 35.0){
				JOptionPane.showMessageDialog(null, "Olá " + nome + " você está com Obesidade Nível I!");
			} else if (imc >= 35.0 && imc < 40.0){
				JOptionPane.showMessageDialog(null, "Olá " + nome + " você está com Obesidade Nível II!");
			} else if (imc >= 40){
				JOptionPane.showMessageDialog(null, "Olá " + nome + " você está com Obesidade Nível III!");
		}
	}

}
