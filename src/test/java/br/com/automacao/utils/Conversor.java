package br.com.automacao.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Conversor {

	public static BigDecimal converterValorMonetarioComSiglaParaBigDecimal(String valorComSigra) {
		String valorFormatado = valorComSigra.substring(valorComSigra.indexOf("R$") + 3, valorComSigra.length());
		return new BigDecimal(valorFormatado.replace(",", "."));
	}

	public static String converterBigDecimalParaValoMonetarioComSigla(BigDecimal valor) {
		DecimalFormat decFormat = new DecimalFormat("'R$ '#,##0.00");
		return decFormat.format(valor);

	}

}