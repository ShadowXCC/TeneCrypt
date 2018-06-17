import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Calendar;
import java.math.BigInteger;

@SuppressWarnings("unused")
public class Algorithm {
	Algorithm(){	}
	public static String Activate() throws IOException{
		/*
		Algorithm
		- Get classes that need the key from key reader to read the file created by keyreader.class
		- Tear apart SBO.class and turn it into a proper/custom encryption in public, asymmetric key
		- Secret number is based off of relationship between the angles the minute and hour hand make on a clock, with a defined 0 value(either 12 being 0, or any position on the clock to make it harder)
		*/
		SecureRandom generator = new SecureRandom();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int RandomNumber = generator.nextInt(2) + 1;
		
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		String WorkspaceFileName = null;
		int WantedLineCount = 1;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			WorkspaceFileName = FileGuts.nextLine();
		}
		WorkspaceFileName = "Temp\\" + WorkspaceFileName;
		File WorkspaceFile = new File(WorkspaceFileName + ".shde");
		@SuppressWarnings("resource")
		FileWriter fw = new FileWriter(WorkspaceFileName);
		String EKey = "E";
		String DKey = "D";
		String EKeyLower = "e";
		String DKeyLower = "d";
		String MainMenuKey = "1";
		String ToEncrypt = "";
		int Second = cal.get(Calendar.SECOND);
		BigInteger SecondNum = new BigInteger(Integer.toString(Second));
		
		String A = "A";
		String B = "B";
		String C = "C";
		String D = "D";
		String E = "E";
		String F = "F";
		String G = "G";
		String H = "H";
		String I = "I";
		String J = "J";
		String K = "K";
		String L = "L";
		String M = "M";
		String N = "N";
		String O = "O";
		String P = "P";
		String Q = "Q";
		String R = "R";
		String S = "S";
		String T = "T";
		String U = "U";
		String V = "V";
		String W = "W";
		String X = "X";
		String Y = "Y";
		String Z = "Z";
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		String e = "e";
		String f = "f";
		String g = "g";
		String h = "h";
		String i = "i";
		String j = "j";
		String k = "k";
		String l = "l";
		String m = "m";
		String n = "n";
		String o = "o";
		String p = "p";
		String q = "q";
		String r = "r";
		String s = "s";
		String t = "t";
		String u = "u";
		String v = "v";
		String w = "w";
		String x = "x";
		String y = "y";
		String z = "z";
		String one = "1";
		String two = "2";
		String three = "3";
		String four = "4";
		String five = "5";
		String six = "6";
		String seven = "7";
		String eight = "8";
		String nine = "9";
		String zero = "0";
		String period = ".";
		String exclamation = "!";
		String question = "?";
		String apostrophe = "'";
		String comma = ",";
		String space = " ";
		String dash = "-";
		String colon = ":";
		String semicolon  = ";";
		String dollarSign = "$";
		String euroSign = "�";
		String poundSign = "�";
		String at = "@";
		String ampersand = "&";
		String slash = "/";
		String tilde = "~";
		String openParen = "(";
		String closeParen= ")";
		String times = "*";
		String plus = "+";
		
		BigInteger CapANum = new BigInteger("437");
		BigInteger CapBNum = new BigInteger("160");
		BigInteger CapCNum = new BigInteger("742");
		BigInteger CapDNum = new BigInteger("370");
		BigInteger CapENum = new BigInteger("180");
		BigInteger CapFNum = new BigInteger("299");
		BigInteger CapGNum = new BigInteger("563");
		BigInteger CapHNum = new BigInteger("920");
		BigInteger CapINum = new BigInteger("593");
		BigInteger CapJNum = new BigInteger("948");
		BigInteger CapKNum = new BigInteger("365");
		BigInteger CapLNum = new BigInteger("881");
		BigInteger CapMNum = new BigInteger("168");
		BigInteger CapNNum = new BigInteger("812");
		BigInteger CapONum = new BigInteger("969");
		BigInteger CapPNum = new BigInteger("190");
		BigInteger CapQNum = new BigInteger("497");
		BigInteger CapRNum = new BigInteger("353");
		BigInteger CapSNum = new BigInteger("772");
		BigInteger CapTNum = new BigInteger("688");
		BigInteger CapUNum = new BigInteger("285");
		BigInteger CapVNum = new BigInteger("334");
		BigInteger CapWNum = new BigInteger("193");
		BigInteger CapXNum = new BigInteger("757");
		BigInteger CapYNum = new BigInteger("722");
		BigInteger CapZNum = new BigInteger("502");
		BigInteger aNum = new BigInteger("522");
		BigInteger bNum = new BigInteger("101");
		BigInteger cNum = new BigInteger("796");
		BigInteger dNum = new BigInteger("511");
		BigInteger eNum = new BigInteger("489");
		BigInteger fNum = new BigInteger("546");
		BigInteger gNum = new BigInteger("313");
		BigInteger hNum = new BigInteger("513");
		BigInteger iNum = new BigInteger("156");
		BigInteger jNum = new BigInteger("249");
		BigInteger kNum = new BigInteger("641");
		BigInteger lNum = new BigInteger("803");
		BigInteger mNum = new BigInteger("356");
		BigInteger nNum = new BigInteger("372");
		BigInteger oNum = new BigInteger("210");
		BigInteger pNum = new BigInteger("872");
		BigInteger qNum = new BigInteger("244");
		BigInteger rNum = new BigInteger("624");
		BigInteger sNum = new BigInteger("183");
		BigInteger tNum = new BigInteger("328");
		BigInteger uNum = new BigInteger("658");
		BigInteger vNum = new BigInteger("831");
		BigInteger wNum = new BigInteger("906");
		BigInteger xNum = new BigInteger("275");
		BigInteger yNum = new BigInteger("300");
		BigInteger zNum = new BigInteger("420");
		BigInteger oneNum = new BigInteger("587");
		BigInteger twoNum = new BigInteger("608");
		BigInteger threeNum = new BigInteger("711");
		BigInteger fourNum = new BigInteger("771");
		BigInteger fiveNum = new BigInteger("789");
		BigInteger sixNum = new BigInteger("569");
		BigInteger sevenNum = new BigInteger("219");
		BigInteger eightNum = new BigInteger("739");
		BigInteger nineNum = new BigInteger("853");
		BigInteger zeroNum = new BigInteger("950");
		BigInteger periodNum = new BigInteger("754");
		BigInteger exclamationNum = new BigInteger("917");
		BigInteger questionNum = new BigInteger("237");
		BigInteger apostropheNum = new BigInteger("859");
		BigInteger commaNum = new BigInteger("666");
		BigInteger spaceNum = new BigInteger("704");
		BigInteger dashNum = new BigInteger("116");
		BigInteger colonNum = new BigInteger("543");
		BigInteger semicolonNum = new BigInteger("762");
		BigInteger dollarSignNum = new BigInteger("345");
		BigInteger euroSignNum = new BigInteger("549");
		BigInteger poundSignNum = new BigInteger("925");
		BigInteger atNum = new BigInteger("211");
		BigInteger ampersandNum = new BigInteger("974");
		BigInteger slashNum = new BigInteger("125");
		BigInteger tildeNum = new BigInteger("238");
		BigInteger openParenNum = new BigInteger("500");
		BigInteger closeParenNum = new BigInteger("788");
		BigInteger timesNum = new BigInteger("828");
		BigInteger plusNum = new BigInteger("381");
		
		BigInteger CapANum1 = new BigInteger("832");
		BigInteger CapBNum1 = new BigInteger("162");
		BigInteger CapCNum1 = new BigInteger("621");
		BigInteger CapDNum1 = new BigInteger("251");
		BigInteger CapENum1 = new BigInteger("125");
		BigInteger CapFNum1 = new BigInteger("763");
		BigInteger CapGNum1 = new BigInteger("927");
		BigInteger CapHNum1 = new BigInteger("653");
		BigInteger CapINum1 = new BigInteger("432");
		BigInteger CapJNum1 = new BigInteger("883");
		BigInteger CapKNum1 = new BigInteger("129");
		BigInteger CapLNum1 = new BigInteger("657");
		BigInteger CapMNum1 = new BigInteger("359");
		BigInteger CapNNum1 = new BigInteger("597");
		BigInteger CapONum1 = new BigInteger("327");
		BigInteger CapPNum1 = new BigInteger("273");
		BigInteger CapQNum1 = new BigInteger("962");
		BigInteger CapRNum1 = new BigInteger("298");
		BigInteger CapSNum1 = new BigInteger("217");
		BigInteger CapTNum1 = new BigInteger("468");
		BigInteger CapUNum1 = new BigInteger("724");
		BigInteger CapVNum1 = new BigInteger("474");
		BigInteger CapWNum1 = new BigInteger("856");
		BigInteger CapXNum1 = new BigInteger("374");
		BigInteger CapYNum1 = new BigInteger("105");
		BigInteger CapZNum1 = new BigInteger("394");
		BigInteger aNum1 = new BigInteger("764");
		BigInteger bNum1 = new BigInteger("835");
		BigInteger cNum1 = new BigInteger("904");
		BigInteger dNum1 = new BigInteger("363");
		BigInteger eNum1 = new BigInteger("867");
		BigInteger fNum1 = new BigInteger("523");
		BigInteger gNum1 = new BigInteger("590");
		BigInteger hNum1 = new BigInteger("386");
		BigInteger iNum1 = new BigInteger("951");
		BigInteger jNum1 = new BigInteger("711");
		BigInteger kNum1 = new BigInteger("407");
		BigInteger lNum1 = new BigInteger("189");
		BigInteger mNum1 = new BigInteger("122");
		BigInteger nNum1 = new BigInteger("860");
		BigInteger oNum1 = new BigInteger("540");
		BigInteger pNum1 = new BigInteger("581");
		BigInteger qNum1 = new BigInteger("668");
		BigInteger rNum1 = new BigInteger("989");
		BigInteger sNum1 = new BigInteger("943");
		BigInteger tNum1 = new BigInteger("684");
		BigInteger uNum1 = new BigInteger("516");
		BigInteger vNum1 = new BigInteger("185");
		BigInteger wNum1 = new BigInteger("855");
		BigInteger xNum1 = new BigInteger("694");
		BigInteger yNum1 = new BigInteger("222");
		BigInteger zNum1 = new BigInteger("367");
		BigInteger oneNum1 = new BigInteger("398");
		BigInteger twoNum1 = new BigInteger("500");
		BigInteger threeNum1 = new BigInteger("543");
		BigInteger fourNum1 = new BigInteger("103");
		BigInteger fiveNum1 = new BigInteger("192");
		BigInteger sixNum1 = new BigInteger("123");
		BigInteger sevenNum1 = new BigInteger("314");
		BigInteger eightNum1 = new BigInteger("723");
		BigInteger nineNum1 = new BigInteger("691");
		BigInteger zeroNum1 = new BigInteger("501");
		BigInteger periodNum1 = new BigInteger("442");
		BigInteger exclamationNum1 = new BigInteger("207");
		BigInteger questionNum1 = new BigInteger("139");
		BigInteger apostropheNum1 = new BigInteger("896");
		BigInteger commaNum1 = new BigInteger("281");
		BigInteger spaceNum1 = new BigInteger("549");
		BigInteger dashNum1 = new BigInteger("669");
		BigInteger colonNum1 = new BigInteger("594");
		BigInteger semicolonNum1 = new BigInteger("710");
		BigInteger dollarSignNum1 = new BigInteger("745");
		BigInteger euroSignNum1 = new BigInteger("629");
		BigInteger poundSignNum1 = new BigInteger("920");
		BigInteger atNum1 = new BigInteger("742");
		BigInteger ampersandNum1 = new BigInteger("950");
		BigInteger slashNum1 = new BigInteger("223");
		BigInteger tildeNum1 = new BigInteger("566");
		BigInteger openParenNum1 = new BigInteger("582");
		BigInteger closeParenNum1 = new BigInteger("891");
		BigInteger timesNum1 = new BigInteger("899");
		BigInteger plusNum1 = new BigInteger("102");
				
		FileGuts.close();
		String Activator = "";
		return Activator;
	}
}