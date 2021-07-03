//Berk Yýldýz 150117052

import java.util.Scanner;

public class berkyýldýz {

	public static void main(String[] args) throws IllegalArgumentException {

		// Declaring our number, asking and taking it from user
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();

		// Size of number
		int size = number.length();
		// Formatted number
		String formattedNumber = null;

		// Adding necessary zeros
		if (size == 1)
			formattedNumber = "0" + number;
		else if (size == 2)
			formattedNumber = "" + number;
		else if (size == 3)
			formattedNumber = "0" + number;
		else if (size == 4)
			formattedNumber = "" + number;
		else if (size == 5)
			formattedNumber = "0" + number;
		else if (size == 6)
			formattedNumber = "" + number;
		else if (size == 7)
			formattedNumber = "0" + number;
		else if (size == 8)
			formattedNumber = "" + number;
		// Error for big inputs
		else if (size >= 9)
			throw new IllegalArgumentException("Error detected: Number is bigger than 4 byte!");

		// Declaring our type, asking and taking it from user
		System.out.println("Data type: ");
		Scanner input2 = new Scanner(System.in);
		char type = input2.next().charAt(0);

		double decimal;
		int sizeNew = formattedNumber.length();
		// Calculating the signed integer
		if (type == 'S') {
			if (formattedNumber.charAt(0) < '8')
				decimal = hexaToUnsigned(formattedNumber, sizeNew);
			else
				decimal = hexaToSigned(formattedNumber, sizeNew);
			System.out.println(decimal);
		}
		// Calculating the unsigned integer
		else if (type == 'U') {
			decimal = hexaToUnsigned(formattedNumber, sizeNew);
			System.out.println(decimal);
		}
		// Calculating the floating point number
		else if (type == 'F') {
			decimal = hexaToFloating(formattedNumber, sizeNew);
			System.out.println(decimal);
		}

	}

	// Calculating only signed negative numbers
	private static double hexaToSigned(String Number, int size) {
		double value = 0;
		double value2 = 0;
		double value3 = 0;
		double value4 = 0;
		double value5 = 0;
		double value6 = 0;
		double value7 = 0;
		double value8 = 0;

		double decimal = 0;

		if (size == 2) {

			value = hexaToDecimal2(Number.charAt(0)) * Math.pow(2, 4);
			value2 = hexaToDecimal(Number.charAt(1)) * Math.pow(2, 0);
			decimal = value + value2;

		} else if (size == 4) {
			value = hexaToDecimal2(Number.charAt(0)) * Math.pow(2, 12);
			value2 = hexaToDecimal(Number.charAt(1)) * Math.pow(2, 8);
			value3 = hexaToDecimal(Number.charAt(2)) * Math.pow(2, 4);
			value4 = hexaToDecimal(Number.charAt(3)) * Math.pow(2, 0);
			decimal = value + value2 + value3 + value4;
		} else if (size == 6) {
			value = hexaToDecimal2(Number.charAt(0)) * Math.pow(2, 20);
			value2 = hexaToDecimal(Number.charAt(1)) * Math.pow(2, 16);
			value3 = hexaToDecimal(Number.charAt(2)) * Math.pow(2, 12);
			value4 = hexaToDecimal(Number.charAt(3)) * Math.pow(2, 8);
			value5 = hexaToDecimal(Number.charAt(4)) * Math.pow(2, 4);
			value6 = hexaToDecimal(Number.charAt(5)) * Math.pow(2, 0);
			decimal = value + value2 + value3 + value4 + value5 + value6;
		} else if (size == 8) {
			value = hexaToDecimal2(Number.charAt(0)) * Math.pow(2, 28);
			value2 = hexaToDecimal(Number.charAt(1)) * Math.pow(2, 24);
			value3 = hexaToDecimal(Number.charAt(2)) * Math.pow(2, 20);
			value4 = hexaToDecimal(Number.charAt(3)) * Math.pow(2, 16);
			value5 = hexaToDecimal(Number.charAt(4)) * Math.pow(2, 12);
			value6 = hexaToDecimal(Number.charAt(5)) * Math.pow(2, 8);
			value7 = hexaToDecimal(Number.charAt(6)) * Math.pow(2, 4);
			value8 = hexaToDecimal(Number.charAt(7)) * Math.pow(2, 0);
			decimal = value + value2 + value3 + value4 + value5 + value6 + value7 + value8;
		}

		return decimal;
	}

	// Calculating unsigned and signed positive numbers
	private static double hexaToUnsigned(String Number, int size) {

		double value = 0;
		double value2 = 0;
		double value3 = 0;
		double value4 = 0;
		double value5 = 0;
		double value6 = 0;
		double value7 = 0;
		double value8 = 0;

		double decimal = 0;

		if (size == 2) {
			value = hexaToDecimal(Number.charAt(0)) * Math.pow(2, 4);
			value2 = hexaToDecimal(Number.charAt(1)) * Math.pow(2, 0);
			decimal = value + value2;
		} else if (size == 4) {
			value = hexaToDecimal(Number.charAt(0)) * Math.pow(2, 12);
			value2 = hexaToDecimal(Number.charAt(1)) * Math.pow(2, 8);
			value3 = hexaToDecimal(Number.charAt(2)) * Math.pow(2, 4);
			value4 = hexaToDecimal(Number.charAt(3)) * Math.pow(2, 0);
			decimal = value + value2 + value3 + value4;
		} else if (size == 6) {
			value = hexaToDecimal(Number.charAt(0)) * Math.pow(2, 20);
			value2 = hexaToDecimal(Number.charAt(1)) * Math.pow(2, 16);
			value3 = hexaToDecimal(Number.charAt(2)) * Math.pow(2, 12);
			value4 = hexaToDecimal(Number.charAt(3)) * Math.pow(2, 8);
			value5 = hexaToDecimal(Number.charAt(4)) * Math.pow(2, 4);
			value6 = hexaToDecimal(Number.charAt(5)) * Math.pow(2, 0);
			decimal = value + value2 + value3 + value4 + value5 + value6;
		} else if (size == 8) {
			value = hexaToDecimal(Number.charAt(0)) * Math.pow(2, 28);
			value2 = hexaToDecimal(Number.charAt(1)) * Math.pow(2, 24);
			value3 = hexaToDecimal(Number.charAt(2)) * Math.pow(2, 20);
			value4 = hexaToDecimal(Number.charAt(3)) * Math.pow(2, 16);
			value5 = hexaToDecimal(Number.charAt(4)) * Math.pow(2, 12);
			value6 = hexaToDecimal(Number.charAt(5)) * Math.pow(2, 8);
			value7 = hexaToDecimal(Number.charAt(6)) * Math.pow(2, 4);
			value8 = hexaToDecimal(Number.charAt(7)) * Math.pow(2, 0);
			decimal = value + value2 + value3 + value4 + value5 + value6 + value7 + value8;
		}

		return decimal;

	}

	// Converting hexadecimal number directly to its decimal value for negatives
	private static int hexaToDecimal2(char hex) throws IllegalArgumentException {
		int value = 0;

		if (hex == '8')
			value = -8;
		else if (hex == '9')
			value = -7;
		else if (hex == 'A')
			value = -6;
		else if (hex == 'B')
			value = -5;
		else if (hex == 'C')
			value = -4;
		else if (hex == 'D')
			value = -3;
		else if (hex == 'E')
			value = -2;
		else if (hex == 'F')
			value = -1;
		else
			throw new IllegalArgumentException("Inappropriate input!");

		return value;
	}

	// Converting hexadecimal number directly to its decimal value for positives
	private static int hexaToDecimal(char hex) throws IllegalArgumentException {
		int value = 0;

		if (hex == '0')
			value = 0;
		else if (hex == '1')
			value = 1;
		else if (hex == '2')
			value = 2;
		else if (hex == '3')
			value = 3;
		else if (hex == '4')
			value = 4;
		else if (hex == '5')
			value = 5;
		else if (hex == '6')
			value = 6;
		else if (hex == '7')
			value = 7;
		else if (hex == '8')
			value = 8;
		else if (hex == '9')
			value = 9;
		else if (hex == 'A')
			value = 10;
		else if (hex == 'B')
			value = 11;
		else if (hex == 'C')
			value = 12;
		else if (hex == 'D')
			value = 13;
		else if (hex == 'E')
			value = 14;
		else if (hex == 'F')
			value = 15;
		else
			throw new IllegalArgumentException("Inappropriate input!");

		return value;
	}

	// Calculating floating point numbers
	private static double hexaToFloating(String formattedNumber, int sizeNew) {

		String hexFinal = allHexaToBinary(formattedNumber, sizeNew);

		int binaryCount = sizeNew * 4;
		char[] binaryNumber = new char[binaryCount];

		for (int i = 0; i < binaryCount; i++) {
			binaryNumber[i] = hexFinal.charAt(i);
		}

		double decimal = 0;
		int sign = 0;
		int exponent = 0;
		int smallE = 0;
		int bigE = 0;
		double mantissa = 1;

		if (hexFinal.charAt(0) == '0')
			sign = 0;
		else if (hexFinal.charAt(0) == '1')
			sign = 1;

		if (sizeNew == 2) {
			exponent = 4;
		} else if (sizeNew == 4) {
			exponent = 6;
		}
		// Exponent calculation
		for (int i = 0; i < exponent; i++) {
			int j = exponent;
			smallE += (int) Math.pow(2, i) * binaryNumber[j--];
		}

		bigE = smallE - ((int) Math.pow(2, exponent - 1) - 1);
		// Mantissa calculation
		for (int i = exponent + 1; i < hexFinal.length(); i++) {
			int j = 1;
			mantissa += (double) Math.pow(2, -j) * binaryNumber[i];
			j++;

		}
		decimal = Math.pow((-1), sign) * mantissa * Math.pow(2, bigE);
		// Rounding
		if (sizeNew == 6) {
			exponent = 8;
			if (hexFinal.charAt(21) == '1') {
				binaryNumber[21] = 0;
				if (hexFinal.charAt(22) == '1') {
					binaryNumber[20] = 1;
				}
				// Rounding
			}
		} else if (sizeNew == 8) {
			exponent = 10;
			if (hexFinal.charAt(23) == '1') {
				binaryNumber[23] = 0;
				if (hexFinal.charAt(24) == '1') {
					binaryNumber[22] = 1;
				}
			}
		}

		if (sizeNew == 6 || sizeNew == 8) {
			// Exponent calculation
			for (int i = 0; i < exponent; i++) {
				int j = exponent;
				smallE += (int) Math.pow(2, i) * binaryNumber[j--];
			}

			bigE = smallE - ((int) Math.pow(2, exponent - 1) - 1);
			// Mantissa calculation
			for (int i = exponent + 1; i <= exponent + 13; i++) {
				int j = 1;
				mantissa += (double) Math.pow(2, -j) * binaryNumber[i];
				j++;

			}
			decimal = Math.pow((-1), sign) * mantissa * Math.pow(2, bigE);
		}
		// Denormalized Values
		if (hexFinal.contains("1")) {
		} else {
			decimal = 0;
			char hex = formattedNumber.charAt(0);
			if (hex == '8')
				System.out.print("-");
			else if (hex == '9')
				System.out.print("-");
			else if (hex == 'A')
				System.out.print("-");
			else if (hex == 'B')
				System.out.print("-");
			else if (hex == 'C')
				System.out.print("-");
			else if (hex == 'D')
				System.out.print("-");
			else if (hex == 'E')
				System.out.print("-");
			else if (hex == 'F')
				System.out.print("-");
			else
				System.out.print("+");
		}

		// Special Values (Using infinity character gives error to me thats why I didn't
		// use it)
		if (sizeNew == 2) {
			if (hexFinal.substring(1, 4).equals("1111")) {
				if ((hexFinal.substring(5, 7).equals("000"))) {
					if (hexFinal.charAt(0) == '0') {
						System.out.println("Infinity");
						System.exit(0);
					} else if (hexFinal.charAt(0) == '1') {
						System.out.println("Minus Infinity");
						System.exit(0);
					}
				} else {
					System.out.println("NaN");
					System.exit(0);
				}
			}
		} else if (sizeNew == 4) {
			if (hexFinal.substring(1, 6).equals("111111")) {
				if ((hexFinal.substring(7, 15).equals("000000000"))) {
					if (hexFinal.charAt(0) == '0') {
						System.out.println("Infinity");
						System.exit(0);
					} else if (hexFinal.charAt(0) == '1') {
						System.out.println("Minus Infinity");
						System.exit(0);
					}
				} else {
					System.out.println("NaN");
					System.exit(0);
				}
			}
		} else if (sizeNew == 6) {
			if (hexFinal.substring(1, 8).equals("11111111")) {
				if ((hexFinal.substring(9, 23).equals("000000000000000"))) {
					if (hexFinal.charAt(0) == '0') {
						System.out.println("Infinity");
						System.exit(0);
					} else if (hexFinal.charAt(0) == '1') {
						System.out.println("Minus Infinity");
						System.exit(0);
					}

				} else {
					System.out.println("NaN");
					System.exit(0);
				}
			}
		} else if (sizeNew == 8) {
			if (hexFinal.substring(1, 10).equals("11111111")) {
				if ((hexFinal.substring(11, 31).equals("00000000000000000000"))) {
					if (hexFinal.charAt(0) == '0') {
						System.out.println("Infinity");
						System.exit(0);
					} else if (hexFinal.charAt(0) == '1') {
						System.out.println("Minus Infinity");
						System.exit(0);
					}
				} else {
					System.out.println("NaN");
					System.exit(0);
				}
			}
		}

		return decimal;
	}

	// Converting hexadecimal number to binary
	private static String hexaToBinary(char hex) throws IllegalArgumentException {
		String binary = null;

		if (hex == '0')
			binary = "0000";
		else if (hex == '1')
			binary = "0001";
		else if (hex == '2')
			binary = "0010";
		else if (hex == '3')
			binary = "0011";
		else if (hex == '4')
			binary = "0100";
		else if (hex == '5')
			binary = "0101";
		else if (hex == '6')
			binary = "0110";
		else if (hex == '7')
			binary = "0111";
		else if (hex == '8')
			binary = "1000";
		else if (hex == '9')
			binary = "1001";
		else if (hex == 'A')
			binary = "1010";
		else if (hex == 'B')
			binary = "1011";
		else if (hex == 'C')
			binary = "1100";
		else if (hex == 'D')
			binary = "1101";
		else if (hex == 'E')
			binary = "1110";
		else if (hex == 'F')
			binary = "1111";
		else
			throw new IllegalArgumentException("Inappropriate input!");

		return binary;
	}

	// Convert all parts of hexadecimal to binary
	private static String allHexaToBinary(String formattedNumber, int sizeNew) {

		String hex1 = null;
		String hex2 = null;
		String hex3 = null;
		String hex4 = null;
		String hex5 = null;
		String hex6 = null;
		String hex7 = null;
		String hex8 = null;
		String hexFinal = null;

		if (sizeNew == 2) {
			hex1 = hexaToBinary(formattedNumber.charAt(0));
			hex2 = hexaToBinary(formattedNumber.charAt(1));
			hexFinal = "" + hex1 + "" + hex2 + "";
		}

		else if (sizeNew == 4) {
			hex1 = hexaToBinary(formattedNumber.charAt(0));
			hex2 = hexaToBinary(formattedNumber.charAt(1));
			hex3 = hexaToBinary(formattedNumber.charAt(2));
			hex4 = hexaToBinary(formattedNumber.charAt(3));
			hexFinal = "" + hex1 + "" + hex2 + "" + hex3 + "" + hex4 + "";
		}

		else if (sizeNew == 6) {
			hex1 = hexaToBinary(formattedNumber.charAt(0));
			hex2 = hexaToBinary(formattedNumber.charAt(1));
			hex3 = hexaToBinary(formattedNumber.charAt(2));
			hex4 = hexaToBinary(formattedNumber.charAt(3));
			hex5 = hexaToBinary(formattedNumber.charAt(4));
			hex6 = hexaToBinary(formattedNumber.charAt(5));
			hexFinal = "" + hex1 + "" + hex2 + "" + hex3 + "" + hex4 + "" + hex5 + "" + hex6 + "";

		}

		else if (sizeNew == 8) {
			hex1 = hexaToBinary(formattedNumber.charAt(0));
			hex2 = hexaToBinary(formattedNumber.charAt(1));
			hex3 = hexaToBinary(formattedNumber.charAt(2));
			hex4 = hexaToBinary(formattedNumber.charAt(3));
			hex5 = hexaToBinary(formattedNumber.charAt(4));
			hex6 = hexaToBinary(formattedNumber.charAt(5));
			hex7 = hexaToBinary(formattedNumber.charAt(6));
			hex8 = hexaToBinary(formattedNumber.charAt(7));
			hexFinal = "" + hex1 + "" + hex2 + "" + hex3 + "" + hex4 + "" + hex5 + "" + hex6 + "" + hex7 + "" + hex8
					+ "";
		}

		return hexFinal;

	}

}
