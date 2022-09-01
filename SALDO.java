package steven;

import java.util.Scanner;

public class SALDO {
	public static void main(String args[]) {
		
		double inss, ir , sindicato, antiguedad, inssPatronal, totalDeducciones, ingresoNeto;
		double montoINSS, montoIR, montoSindicato, montoAntiguedad, montoINSSPatronal, salarioBruto, ingresoTotal;
		
		inss = 7;
		ir = 15.6;
		sindicato = 1;
		inssPatronal = 22.5;
		antiguedad = 15;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el salario bruto");
		salarioBruto = entrada.nextDouble();
		
		montoAntiguedad = (salarioBruto * antiguedad)/100;
		
		montoSindicato = (salarioBruto * sindicato)/100;
		
		ingresoTotal = (salarioBruto + montoAntiguedad);
		
		montoINSS = (ingresoTotal*inss)/100;
		
		montoIR = (ingresoTotal*ir)/100;
		
		totalDeducciones =  montoINSS+montoIR+montoSindicato;
		
		montoINSSPatronal = (ingresoTotal * inssPatronal)/100;
		
		ingresoNeto = (ingresoTotal - totalDeducciones);
		
		System.out.println("------Nomina del usuario------");
		System.out.println("---------TASAS---------");
		System.out.println("INGESOS----------------");
		System.out.println("Su ingreso bruto es: "+String.format("%.2f",salarioBruto));
		System.out.println("Tiempo de antiguedad: " + antiguedad);
		System.out.println("su monto de antiduedad es "+String.format("%.2f",montoAntiguedad));
		System.out.println("------DEDUCCIONES------");
		System.out.println("tasa de INSS: "+ inss + "%");
		System.out.println("su INSS es: "+String.format("%.2f",montoINSS));
		System.out.println("tasa de ir; "+ ir +"%");
		System.out.println("su IR es: "+String.format("%.2f",montoIR));
		System.out.println("tasa de afiliaciones de sindicato: "+ sindicato + "%");
		System.out.println("su INSS ES: "+String.format("%.2f",montoSindicato));
		System.out.println("------CALCULOS FIALES--------");
		
		System.out.println("su ingreso Total es: "+ String.format("%.2f",ingresoTotal));
		System.out.println("su deducciontotal es: " +String.format("%.2f",totalDeducciones));
		System.out.println("su salario neto es : " +String.format("%.2f",ingresoNeto));
		System.out.println("u INSSpatronal es: " +String.format("%.2f",montoINSSPatronal));
		
		entrada.close();
		
	}
}
