package com.app.numberprinter.mainprogram;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import com.app.numberprinter.constant.NumberPrinterConstant;

import com.app.numberprinter.serviceimpl.NumberToRomanImpl;
import com.app.numberprinter.serviceimpl.NumberToWordsImpl;
/**
 * NumberPrinter is the main class.
 * to start the conversion in Roman Numerals or words.
 * @author Ravikumar
 *
 */
public class NumberPrinter {
	
	/**
	 * private constructor.
	 */
	private NumberPrinter(){
		}
	private static final Logger LOGGER = Logger.getLogger(NumberPrinter.class.getName());


	/**
	 * This is the Main Method to start the service.
	 * @param args.
	 */
	public static void main(String[] args) {
		int number = 0;
		int format = 0;
		String output = null;
		final Scanner start = getReadyForConversion();
		while (start.hasNext()
				&& (StringUtils.equalsIgnoreCase(start.nextLine(),
						NumberPrinterConstant.YES_FLAG))) {
			try {
				format = getOutputFormat();
				output = getOutputFormatValue(format);
				number = getNumber();
				if (format == 1 || format == 2) {
					getNumberConvertedValues(number, output);
				}
			} catch (InputMismatchException e) {
				invalidInput();
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage());
			}
			LOGGER.info(NumberPrinterConstant.TO_CONTINUE);
		}
		LOGGER.info(NumberPrinterConstant.THANK_YOU);
		System.exit(0);
	}

	/**
	 * This method is used to call method  getRomanNumerals and getWords.
	 * @param number is one of the parameter from user. 
	 * for converting to Roman numerals or Numbers as words.
	 * @param outputFormat is the second parameter. 
	 * for the type of output format in Roman or words.
	 */
	private static void getNumberConvertedValues(final int number, final String outputFormat) {
		
		getRomanNumerals(number, outputFormat);

		getWords(number, outputFormat);
	}

	/**
	 * This method used to get the input number from user for validation.
	 * @return number between 1 to 3999.
	 * @throws Exception as The Solution is Only Required To Convert Numbers in the Range 1 - 3999.
	 */
	private static int getNumber() throws Exception {
		int number;
		final Scanner inputNumber = new Scanner(System.in);
		LOGGER.info(NumberPrinterConstant.NUMBER_RANGE);
		number = inputNumber.nextInt();
		if (number < 1 || number > 3999) {
			LOGGER.info("################## WARNING MESSAGE #################");
			throw new Exception(
					NumberPrinterConstant.RULE_FOR_NUMBER_RANGE);
		}

		LOGGER.info(NumberPrinterConstant.ENTERED_VALUES + number);
		return number;
	}

	/**
	 * This method used for validating the type of output format in Roman or words.
	 * @param format is input parameter from user will be 1 or 2.
	 * @return Roman or words.
	 * @throws Exception as Enter Type of Output Format.
	 * 1 ---> ROMAN or 2 ---> WORDS.
	 */
	private static String getOutputFormatValue(final int format) throws Exception {
		String output;
		output = NumberPrinterConstant.formatValues.get(format);
		if (output == null) {
			LOGGER.info("################## WARNING MESSAGE #################");
			throw new Exception(NumberPrinterConstant.OUTPUT_FORMAT);
		}
		LOGGER.info(NumberPrinterConstant.ENTERED_VALUES + output);
		return output;
	}

	/**
	 * This method to get the the Input from user.
	 * for starting the Number conversion to Roman or words.
	 * @return start as string will be y.
	 */
	private static Scanner getReadyForConversion() {
		final Scanner start = new Scanner(System.in);
		LOGGER.info(NumberPrinterConstant.PRESS_Y);
		return start;
	}

	/**
	 * To get the input from user for Output Format .
	 * @return format 1 or 2 .
	 */
	private static int getOutputFormat() {
		int format;
		final Scanner outputFormat = new Scanner(System.in);
		LOGGER.info(NumberPrinterConstant.OUTPUT_FORMAT);
		format = outputFormat.nextInt();
		return format;
	}

	/**
	 * This method will return waring message for users to enter valid input.
	 */
	private static void invalidInput() {
		LOGGER.info("################## WARNING MESSAGE #################");
		LOGGER.info("*****************************************************************************");
		LOGGER.info(NumberPrinterConstant.INPUT_FORMAT);
		LOGGER.info(NumberPrinterConstant.OUTPUT_FORMAT);
		LOGGER.info(NumberPrinterConstant.NUMBER_RANGE);
		LOGGER.info("*****************************************************************************");
	}

	/**
	 * This method is used to get the output in words. 
	 * @param number To Convert Numbers in the Range 1 - 3999.
	 * @param format for number will be in words.
	 */
	private static void getWords(int number, String format) {
		if (StringUtils.equalsIgnoreCase(format, NumberPrinterConstant.WORDS)) {
            final NumberToWordsImpl numToWords = new NumberToWordsImpl();
			LOGGER.info("*********Numbers as Words*********: "+numToWords.convertNumberToWords(number));
		}
	}

	/**
	 * This method is used to get the output in Roman Numerals.
	 * @param number number To Convert Numbers in the Range 1 - 3999
	 * @param format for number will be in Roman.
	 */
	private static void getRomanNumerals(int number, String format) {
		if (StringUtils.equalsIgnoreCase(format, NumberPrinterConstant.ROMAN)) {
            final NumberToRomanImpl numToRom = new NumberToRomanImpl();
			LOGGER.info("*********Roman Numerals**********: "+numToRom.convertToRoman(number));
		}
	}

}
