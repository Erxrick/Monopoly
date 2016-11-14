package edu.neumont.csc110.a.monopoly;

public class asciiArt {
	static char[][] asciiBoard = 
		{("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@:::::::::@`````````@:::::::::@:::::::::@`````````@:::::::::@`````````@:::::::::@:::::::::@`````````````````@").toCharArray(),
		("@`````````````````@:::::::::@`````````@:::::::::@:::::::::@`````````@:::::::::@`````````@:::::::::@:::::::::@`````````````````@").toCharArray(),
		("@`````````````````@:::::::::@`````````@:::::::::@:::::::::@`````````@:::::::::@`````````@:::::::::@:::::::::@`````````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@`````````````````````````````````````````````````````````````````````````````````````````@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@`````````````````````````````````````````````````````````````````````````````````````````@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@`````````````````````````````````````````````````````````````````````````````````````````@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@`````````````````````````````````````````````````````````````````````````````````````````@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@`````````````````````````````````````````````````````````````````````````````````````````@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@`````````````````````````````````````````````````````````````````````````````````````````@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@`````````````````````````````````````````````````````````````````````````````````````````@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````````````````````````````````````````````````````````````````````````````````````@`````````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@`````````````````````````````````````````````````````````````````````````````````````````@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@````````````:::::@`````````````````````````````````````````````````````````````````````````````````````````@:::::````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").toCharArray(),
		("@`````````````````@:::::::::@`````````@``Chance`@Oriental`@`Reading`@`Income``@::Baltic:@``Com````@:::Med:::@```````GO````````@").toCharArray(),
		("@`````````````````@:::::::::@`````````@:::::::::@:Avenue::@`Railroad@``Tax````@::Avenue:@`Chest```@::Avenue:@`````````````````@").toCharArray(),
		("@`````````````````@:::::::::@`````````@:::::::::@:::::::::@`````````@`````````@:::::::::@`````````@:::::::::@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@`````````````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````@`````````````````@").toCharArray(),
		("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@").toCharArray(),
		};
	
}
