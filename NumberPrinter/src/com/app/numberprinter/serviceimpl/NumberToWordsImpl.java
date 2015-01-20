package com.app.numberprinter.serviceimpl;

import com.app.numberprinter.constant.NumberPrinterConstant;
import com.app.numberprinter.helper.NumberToWordsHelper;
import com.app.numberprinter.service.NumberToWords;
/**
 * NumberToWordsImpl is the class used. 
 * to providing some functionality.
 * to converting Number to words. 
 * @author Ravikumar
 *
 */
public class NumberToWordsImpl implements NumberToWords {

	/**
	 * To convert Number to words.
	 * @param Number as input for converting number to words.
	 * @return string. 
	 */
	public String convertNumberToWords(int number) {
        final String prefix = "";
        String current = "";
		int place = 0;
          do {
			final int n = number % 1000;
			if (n != 0) {
				final String words = NumberToWordsHelper.getConvertUptoHundreds(n);
				current = words + NumberPrinterConstant.THOUSANDS[place]
						+ current;
			}
			place++;
			number /= 1000;
		} while (number > 0);

		return (prefix + current).trim();
	}

}
