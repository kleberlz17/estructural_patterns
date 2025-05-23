package br.com.cod3r.bridge.converter.converters;

import java.util.Locale;

import br.com.cod3r.bridge.converter.employees.Employee;

public class CSVConverter implements Converter {

	public String getEmployeeFormated(Employee emp) {
		return String.format(Locale.US, "%s;%d;%.2f", // Pra que saia com ponto(.) as casas decimais.
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
