package edu.neumont.csc110.a.monopoly;

import java.io.IOException;

public class Board {
	public static void moveFromDice(int diceRoll, Player player, BoardTiles allTheProperty) {
		/*
		 * removeOldPosition(currentPlayersPosition); currentPlayersPosition +=
		 * diceRoll; newPlayerPosition(currentPLayerPosition);
		 */
	}

	public static void setMainBoard(Player[] Player, int person) throws IOException {
		reinitializeBoard();
		for(int i=0;i<person;i++) {
			if (Player[i].getPlayerPosition() == 0) {
				position0(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 1) {
				position1(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 2) {
				position2(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 3) {
				position3(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 4) {
				position4(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 5) {
				position5(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 6) {
				position6(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 7) {
				position7(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 8) {
				position8(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 9) {
				position9(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 10) {
				position10(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 11) {
				position11(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 12) {
				position12(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 13) {
				position13(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 14) {
				position14(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 15) {
				position15(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 16) {
				position16(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 17) {
				position17(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 18) {
				position18(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 19) {
				position19(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 20) {
				position20(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 21) {
				position21(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 22) {
				position22(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 23) {
				position23(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 24) {
				position24(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 25) {
				position25(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 26) {
				position26(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 27) {
				position27(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 28) {
				position28(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 29) {
				position29(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 30) {
				position30(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 31) {
				position31(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 32) {
				position32(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 33) {
				position33(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 34) {
				position34(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 35) {
				position35(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 36) {
				position36(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 37) {
				position37(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 38) {
				position38(Player[i]);
			}
			if (Player[i].getPlayerPosition() == 39) {
				position39(Player[i]);
			}
		}
	}
	public static void printMainBoard() {
		//System.out.println(asciiArt.asciiBoard);
		for (int i = 0; i < asciiArt.asciiBoard.length; i++) {
			for (int j = 0; j < asciiArt.asciiBoard[i].length; j++) {
				System.out.print(asciiArt.asciiBoard[i][j]);
			}
			System.out.println();
		}
	}
	

	public static void position0(Player player) {
		BoardLogic.Go();
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][110] = '(';
			asciiArt.asciiBoard[52][111] = 'T';
			asciiArt.asciiBoard[52][112] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][110] = '(';
			asciiArt.asciiBoard[49][111] = 'W';
			asciiArt.asciiBoard[49][112] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][110] = '(';
			asciiArt.asciiBoard[50][111] = 'S';
			asciiArt.asciiBoard[50][112] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][110] = '(';
			asciiArt.asciiBoard[51][111] = 'D';
			asciiArt.asciiBoard[51][112] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][114] = '(';
			asciiArt.asciiBoard[52][115] = 'C';
			asciiArt.asciiBoard[52][116] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][114] = '(';
			asciiArt.asciiBoard[49][115] = 'I';
			asciiArt.asciiBoard[49][116] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][114] = '(';
			asciiArt.asciiBoard[50][115] = 'H';
			asciiArt.asciiBoard[50][116] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][114] = '(';
			asciiArt.asciiBoard[51][115] = 'B';
			asciiArt.asciiBoard[51][116] = ')';
		}
	}

	public static void position1(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][100] = '(';
			asciiArt.asciiBoard[52][101] = 'T';
			asciiArt.asciiBoard[52][102] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][100] = '(';
			asciiArt.asciiBoard[49][101] = 'W';
			asciiArt.asciiBoard[49][102] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][100] = '(';
			asciiArt.asciiBoard[50][101] = 'S';
			asciiArt.asciiBoard[50][102] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][100] = '(';
			asciiArt.asciiBoard[51][101] = 'D';
			asciiArt.asciiBoard[51][102] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][104] = '(';
			asciiArt.asciiBoard[52][105] = 'C';
			asciiArt.asciiBoard[52][106] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][104] = '(';
			asciiArt.asciiBoard[49][105] = 'I';
			asciiArt.asciiBoard[49][106] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][104] = '(';
			asciiArt.asciiBoard[50][105] = 'H';
			asciiArt.asciiBoard[50][106] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][104] = '(';
			asciiArt.asciiBoard[51][105] = 'B';
			asciiArt.asciiBoard[51][106] = ')';
		}
	}

	public static void position2(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][90] = '(';
			asciiArt.asciiBoard[52][91] = 'T';
			asciiArt.asciiBoard[52][92] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][90] = '(';
			asciiArt.asciiBoard[49][91] = 'W';
			asciiArt.asciiBoard[49][92] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][90] = '(';
			asciiArt.asciiBoard[50][91] = 'S';
			asciiArt.asciiBoard[50][92] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][90] = '(';
			asciiArt.asciiBoard[51][91] = 'D';
			asciiArt.asciiBoard[51][92] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][94] = '(';
			asciiArt.asciiBoard[52][95] = 'C';
			asciiArt.asciiBoard[52][96] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][94] = '(';
			asciiArt.asciiBoard[49][95] = 'I';
			asciiArt.asciiBoard[49][96] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][94] = '(';
			asciiArt.asciiBoard[50][95] = 'H';
			asciiArt.asciiBoard[50][96] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][94] = '(';
			asciiArt.asciiBoard[51][95] = 'B';
			asciiArt.asciiBoard[51][96] = ')';
		}
	}

	public static void position3(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][80] = '(';
			asciiArt.asciiBoard[52][81] = 'T';
			asciiArt.asciiBoard[52][82] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][80] = '(';
			asciiArt.asciiBoard[49][81] = 'W';
			asciiArt.asciiBoard[49][82] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][80] = '(';
			asciiArt.asciiBoard[50][81] = 'S';
			asciiArt.asciiBoard[50][82] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][80] = '(';
			asciiArt.asciiBoard[51][81] = 'D';
			asciiArt.asciiBoard[51][82] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][84] = '(';
			asciiArt.asciiBoard[52][85] = 'C';
			asciiArt.asciiBoard[52][86] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][84] = '(';
			asciiArt.asciiBoard[49][85] = 'I';
			asciiArt.asciiBoard[49][86] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][84] = '(';
			asciiArt.asciiBoard[50][85] = 'H';
			asciiArt.asciiBoard[50][86] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][84] = '(';
			asciiArt.asciiBoard[51][85] = 'B';
			asciiArt.asciiBoard[51][86] = ')';
		}
	}

	public static void position4(Player player) throws IOException {
		BoardLogic.Income_Tax(player);
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][70] = '(';
			asciiArt.asciiBoard[52][71] = 'T';
			asciiArt.asciiBoard[52][72] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][70] = '(';
			asciiArt.asciiBoard[49][71] = 'W';
			asciiArt.asciiBoard[49][72] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][70] = '(';
			asciiArt.asciiBoard[50][71] = 'S';
			asciiArt.asciiBoard[50][72] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][70] = '(';
			asciiArt.asciiBoard[51][71] = 'D';
			asciiArt.asciiBoard[51][72] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][74] = '(';
			asciiArt.asciiBoard[52][75] = 'C';
			asciiArt.asciiBoard[52][76] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][74] = '(';
			asciiArt.asciiBoard[49][75] = 'I';
			asciiArt.asciiBoard[49][76] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][74] = '(';
			asciiArt.asciiBoard[50][75] = 'H';
			asciiArt.asciiBoard[50][76] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][74] = '(';
			asciiArt.asciiBoard[51][75] = 'B';
			asciiArt.asciiBoard[51][76] = ')';
		}
	}

	public static void position5(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][60] = '(';
			asciiArt.asciiBoard[52][61] = 'T';
			asciiArt.asciiBoard[52][62] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][60] = '(';
			asciiArt.asciiBoard[49][61] = 'W';
			asciiArt.asciiBoard[49][62] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][60] = '(';
			asciiArt.asciiBoard[50][61] = 'S';
			asciiArt.asciiBoard[50][62] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][60] = '(';
			asciiArt.asciiBoard[51][61] = 'D';
			asciiArt.asciiBoard[51][62] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][64] = '(';
			asciiArt.asciiBoard[52][65] = 'C';
			asciiArt.asciiBoard[52][66] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][64] = '(';
			asciiArt.asciiBoard[49][65] = 'I';
			asciiArt.asciiBoard[49][66] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][64] = '(';
			asciiArt.asciiBoard[50][65] = 'H';
			asciiArt.asciiBoard[50][66] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][64] = '(';
			asciiArt.asciiBoard[51][65] = 'B';
			asciiArt.asciiBoard[51][66] = ')';
		}
	}

	public static void position6(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][50] = '(';
			asciiArt.asciiBoard[52][51] = 'T';
			asciiArt.asciiBoard[52][52] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][50] = '(';
			asciiArt.asciiBoard[49][51] = 'W';
			asciiArt.asciiBoard[49][52] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][50] = '(';
			asciiArt.asciiBoard[50][51] = 'S';
			asciiArt.asciiBoard[50][52] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][50] = '(';
			asciiArt.asciiBoard[51][51] = 'D';
			asciiArt.asciiBoard[51][52] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][54] = '(';
			asciiArt.asciiBoard[52][55] = 'C';
			asciiArt.asciiBoard[52][56] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][54] = '(';
			asciiArt.asciiBoard[49][55] = 'I';
			asciiArt.asciiBoard[49][56] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][54] = '(';
			asciiArt.asciiBoard[50][55] = 'H';
			asciiArt.asciiBoard[50][56] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][54] = '(';
			asciiArt.asciiBoard[51][55] = 'B';
			asciiArt.asciiBoard[51][56] = ')';
		}
	}

	public static void position7(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][40] = '(';
			asciiArt.asciiBoard[52][41] = 'T';
			asciiArt.asciiBoard[52][42] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][40] = '(';
			asciiArt.asciiBoard[49][41] = 'W';
			asciiArt.asciiBoard[49][42] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][40] = '(';
			asciiArt.asciiBoard[50][41] = 'S';
			asciiArt.asciiBoard[50][42] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][40] = '(';
			asciiArt.asciiBoard[51][41] = 'D';
			asciiArt.asciiBoard[51][42] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][44] = '(';
			asciiArt.asciiBoard[52][45] = 'C';
			asciiArt.asciiBoard[52][46] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][44] = '(';
			asciiArt.asciiBoard[49][45] = 'I';
			asciiArt.asciiBoard[49][46] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][44] = '(';
			asciiArt.asciiBoard[50][45] = 'H';
			asciiArt.asciiBoard[50][46] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][44] = '(';
			asciiArt.asciiBoard[51][45] = 'B';
			asciiArt.asciiBoard[51][46] = ')';
		}
	}

	public static void position8(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][30] = '(';
			asciiArt.asciiBoard[52][31] = 'T';
			asciiArt.asciiBoard[52][32] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][30] = '(';
			asciiArt.asciiBoard[49][31] = 'W';
			asciiArt.asciiBoard[49][32] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][30] = '(';
			asciiArt.asciiBoard[50][31] = 'S';
			asciiArt.asciiBoard[50][32] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][30] = '(';
			asciiArt.asciiBoard[51][31] = 'D';
			asciiArt.asciiBoard[51][32] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][34] = '(';
			asciiArt.asciiBoard[52][35] = 'C';
			asciiArt.asciiBoard[52][36] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][34] = '(';
			asciiArt.asciiBoard[49][35] = 'I';
			asciiArt.asciiBoard[49][36] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][34] = '(';
			asciiArt.asciiBoard[50][35] = 'H';
			asciiArt.asciiBoard[50][36] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][34] = '(';
			asciiArt.asciiBoard[51][35] = 'B';
			asciiArt.asciiBoard[51][36] = ')';
		}
	}

	public static void position9(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][20] = '(';
			asciiArt.asciiBoard[52][21] = 'T';
			asciiArt.asciiBoard[52][22] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][20] = '(';
			asciiArt.asciiBoard[49][21] = 'W';
			asciiArt.asciiBoard[49][22] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][20] = '(';
			asciiArt.asciiBoard[50][21] = 'S';
			asciiArt.asciiBoard[50][22] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][20] = '(';
			asciiArt.asciiBoard[51][21] = 'D';
			asciiArt.asciiBoard[51][22] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][24] = '(';
			asciiArt.asciiBoard[52][25] = 'C';
			asciiArt.asciiBoard[52][26] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][24] = '(';
			asciiArt.asciiBoard[49][25] = 'I';
			asciiArt.asciiBoard[49][26] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][24] = '(';
			asciiArt.asciiBoard[50][25] = 'H';
			asciiArt.asciiBoard[50][26] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][24] = '(';
			asciiArt.asciiBoard[51][25] = 'B';
			asciiArt.asciiBoard[51][26] = ')';
		}
	}

	public static void position10(Player player) {
		//BoardLogic.Jail(player);
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[52][10] = '(';
			asciiArt.asciiBoard[52][11] = 'T';
			asciiArt.asciiBoard[52][12] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[49][10] = '(';
			asciiArt.asciiBoard[49][11] = 'W';
			asciiArt.asciiBoard[49][12] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[50][10] = '(';
			asciiArt.asciiBoard[50][11] = 'S';
			asciiArt.asciiBoard[50][12] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[51][10] = '(';
			asciiArt.asciiBoard[51][11] = 'D';
			asciiArt.asciiBoard[51][12] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[52][14] = '(';
			asciiArt.asciiBoard[52][15] = 'C';
			asciiArt.asciiBoard[52][16] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[49][14] = '(';
			asciiArt.asciiBoard[49][15] = 'I';
			asciiArt.asciiBoard[49][16] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[50][14] = '(';
			asciiArt.asciiBoard[50][15] = 'H';
			asciiArt.asciiBoard[50][16] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[51][14] = '(';
			asciiArt.asciiBoard[51][15] = 'B';
			asciiArt.asciiBoard[51][16] = ')';
		}
	}

	public static void position11(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[43][9] = '(';
			asciiArt.asciiBoard[43][10] = 'T';
			asciiArt.asciiBoard[43][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[42][1] = '(';
			asciiArt.asciiBoard[42][2] = 'W';
			asciiArt.asciiBoard[42][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[42][9] = '(';
			asciiArt.asciiBoard[42][10] = 'S';
			asciiArt.asciiBoard[42][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[43][1] = '(';
			asciiArt.asciiBoard[43][2] = 'D';
			asciiArt.asciiBoard[43][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[44][5] = '(';
			asciiArt.asciiBoard[44][6] = 'C';
			asciiArt.asciiBoard[44][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[42][5] = '(';
			asciiArt.asciiBoard[42][6] = 'I';
			asciiArt.asciiBoard[42][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[44][1] = '(';
			asciiArt.asciiBoard[44][2] = 'H';
			asciiArt.asciiBoard[44][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[43][5] = '(';
			asciiArt.asciiBoard[43][6] = 'B';
			asciiArt.asciiBoard[43][7] = ')';
		}
	}

	public static void position12(Player player) {
		//BoardLogic.Electric_Company();
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[39][9] = '(';
			asciiArt.asciiBoard[39][10] = 'T';
			asciiArt.asciiBoard[39][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[38][1] = '(';
			asciiArt.asciiBoard[38][2] = 'W';
			asciiArt.asciiBoard[38][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[38][9] = '(';
			asciiArt.asciiBoard[38][10] = 'S';
			asciiArt.asciiBoard[38][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[39][1] = '(';
			asciiArt.asciiBoard[39][2] = 'D';
			asciiArt.asciiBoard[39][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[40][5] = '(';
			asciiArt.asciiBoard[40][6] = 'C';
			asciiArt.asciiBoard[40][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[38][5] = '(';
			asciiArt.asciiBoard[38][6] = 'I';
			asciiArt.asciiBoard[38][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[40][1] = '(';
			asciiArt.asciiBoard[40][2] = 'H';
			asciiArt.asciiBoard[40][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[39][5] = '(';
			asciiArt.asciiBoard[39][6] = 'B';
			asciiArt.asciiBoard[39][7] = ')';
		}
	}

	public static void position13(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[35][9] = '(';
			asciiArt.asciiBoard[35][10] = 'T';
			asciiArt.asciiBoard[35][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[34][1] = '(';
			asciiArt.asciiBoard[34][2] = 'W';
			asciiArt.asciiBoard[34][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[34][9] = '(';
			asciiArt.asciiBoard[34][10] = 'S';
			asciiArt.asciiBoard[34][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[35][1] = '(';
			asciiArt.asciiBoard[35][2] = 'D';
			asciiArt.asciiBoard[35][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[36][5] = '(';
			asciiArt.asciiBoard[36][6] = 'C';
			asciiArt.asciiBoard[36][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[34][5] = '(';
			asciiArt.asciiBoard[34][6] = 'I';
			asciiArt.asciiBoard[34][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[36][1] = '(';
			asciiArt.asciiBoard[36][2] = 'H';
			asciiArt.asciiBoard[36][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[35][5] = '(';
			asciiArt.asciiBoard[35][6] = 'B';
			asciiArt.asciiBoard[35][7] = ')';
		}
	}

	public static void position14(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[31][9] = '(';
			asciiArt.asciiBoard[31][10] = 'T';
			asciiArt.asciiBoard[31][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[30][1] = '(';
			asciiArt.asciiBoard[30][2] = 'W';
			asciiArt.asciiBoard[30][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[30][9] = '(';
			asciiArt.asciiBoard[30][10] = 'S';
			asciiArt.asciiBoard[30][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[31][1] = '(';
			asciiArt.asciiBoard[31][2] = 'D';
			asciiArt.asciiBoard[31][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[32][5] = '(';
			asciiArt.asciiBoard[32][6] = 'C';
			asciiArt.asciiBoard[32][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[30][5] = '(';
			asciiArt.asciiBoard[30][6] = 'I';
			asciiArt.asciiBoard[30][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[32][1] = '(';
			asciiArt.asciiBoard[32][2] = 'H';
			asciiArt.asciiBoard[32][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[31][5] = '(';
			asciiArt.asciiBoard[31][6] = 'B';
			asciiArt.asciiBoard[31][7] = ')';
		}
	}

	public static void position15(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[27][9] = '(';
			asciiArt.asciiBoard[27][10] = 'T';
			asciiArt.asciiBoard[27][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[26][1] = '(';
			asciiArt.asciiBoard[26][2] = 'W';
			asciiArt.asciiBoard[26][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[26][9] = '(';
			asciiArt.asciiBoard[26][10] = 'S';
			asciiArt.asciiBoard[26][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[27][1] = '(';
			asciiArt.asciiBoard[27][2] = 'D';
			asciiArt.asciiBoard[27][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[28][5] = '(';
			asciiArt.asciiBoard[28][6] = 'C';
			asciiArt.asciiBoard[28][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[26][5] = '(';
			asciiArt.asciiBoard[26][6] = 'I';
			asciiArt.asciiBoard[26][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[28][1] = '(';
			asciiArt.asciiBoard[28][2] = 'H';
			asciiArt.asciiBoard[28][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[27][5] = '(';
			asciiArt.asciiBoard[27][6] = 'B';
			asciiArt.asciiBoard[27][7] = ')';
		}
	}

	public static void position16(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[23][9] = '(';
			asciiArt.asciiBoard[23][10] = 'T';
			asciiArt.asciiBoard[23][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[22][1] = '(';
			asciiArt.asciiBoard[22][2] = 'W';
			asciiArt.asciiBoard[22][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[22][9] = '(';
			asciiArt.asciiBoard[22][10] = 'S';
			asciiArt.asciiBoard[22][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[23][1] = '(';
			asciiArt.asciiBoard[23][2] = 'D';
			asciiArt.asciiBoard[23][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[24][5] = '(';
			asciiArt.asciiBoard[24][6] = 'C';
			asciiArt.asciiBoard[24][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[22][5] = '(';
			asciiArt.asciiBoard[22][6] = 'I';
			asciiArt.asciiBoard[22][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[24][1] = '(';
			asciiArt.asciiBoard[24][2] = 'H';
			asciiArt.asciiBoard[24][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[23][5] = '(';
			asciiArt.asciiBoard[23][6] = 'B';
			asciiArt.asciiBoard[23][7] = ')';
		}
	}

	public static void position17(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[19][9] = '(';
			asciiArt.asciiBoard[19][10] = 'T';
			asciiArt.asciiBoard[19][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[18][1] = '(';
			asciiArt.asciiBoard[18][2] = 'W';
			asciiArt.asciiBoard[18][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[18][9] = '(';
			asciiArt.asciiBoard[18][10] = 'S';
			asciiArt.asciiBoard[18][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[19][1] = '(';
			asciiArt.asciiBoard[19][2] = 'D';
			asciiArt.asciiBoard[19][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[20][5] = '(';
			asciiArt.asciiBoard[20][6] = 'C';
			asciiArt.asciiBoard[20][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[18][5] = '(';
			asciiArt.asciiBoard[18][6] = 'I';
			asciiArt.asciiBoard[18][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[20][1] = '(';
			asciiArt.asciiBoard[20][2] = 'H';
			asciiArt.asciiBoard[20][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[19][5] = '(';
			asciiArt.asciiBoard[19][6] = 'B';
			asciiArt.asciiBoard[19][7] = ')';
		}
	}

	public static void position18(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[15][9] = '(';
			asciiArt.asciiBoard[15][10] = 'T';
			asciiArt.asciiBoard[15][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[14][1] = '(';
			asciiArt.asciiBoard[14][2] = 'W';
			asciiArt.asciiBoard[14][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[14][9] = '(';
			asciiArt.asciiBoard[14][10] = 'S';
			asciiArt.asciiBoard[14][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[15][1] = '(';
			asciiArt.asciiBoard[15][2] = 'D';
			asciiArt.asciiBoard[15][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[16][5] = '(';
			asciiArt.asciiBoard[16][6] = 'C';
			asciiArt.asciiBoard[16][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[14][5] = '(';
			asciiArt.asciiBoard[14][6] = 'I';
			asciiArt.asciiBoard[14][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[16][1] = '(';
			asciiArt.asciiBoard[16][2] = 'H';
			asciiArt.asciiBoard[16][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[15][5] = '(';
			asciiArt.asciiBoard[15][6] = 'B';
			asciiArt.asciiBoard[15][7] = ')';
		}
	}

	public static void position19(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[11][9] = '(';
			asciiArt.asciiBoard[11][10] = 'T';
			asciiArt.asciiBoard[11][11] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[10][1] = '(';
			asciiArt.asciiBoard[10][2] = 'W';
			asciiArt.asciiBoard[10][3] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[10][9] = '(';
			asciiArt.asciiBoard[10][10] = 'S';
			asciiArt.asciiBoard[10][11] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[11][1] = '(';
			asciiArt.asciiBoard[11][2] = 'D';
			asciiArt.asciiBoard[11][3] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[12][5] = '(';
			asciiArt.asciiBoard[12][6] = 'C';
			asciiArt.asciiBoard[12][7] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[10][5] = '(';
			asciiArt.asciiBoard[10][6] = 'I';
			asciiArt.asciiBoard[10][7] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[12][1] = '(';
			asciiArt.asciiBoard[12][2] = 'H';
			asciiArt.asciiBoard[12][3] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[11][5] = '(';
			asciiArt.asciiBoard[11][6] = 'B';
			asciiArt.asciiBoard[11][7] = ')';
		}
	}

	public static void position20(Player player) {
	//	BoardLogic.Free_Parking();
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][10] = '(';
			asciiArt.asciiBoard[5][11] = 'T';
			asciiArt.asciiBoard[5][12] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][10] = '(';
			asciiArt.asciiBoard[2][11] = 'W';
			asciiArt.asciiBoard[2][12] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][10] = '(';
			asciiArt.asciiBoard[3][11] = 'S';
			asciiArt.asciiBoard[3][12] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][10] = '(';
			asciiArt.asciiBoard[4][11] = 'D';
			asciiArt.asciiBoard[4][12] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][14] = '(';
			asciiArt.asciiBoard[5][15] = 'C';
			asciiArt.asciiBoard[5][16] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][14] = '(';
			asciiArt.asciiBoard[2][15] = 'I';
			asciiArt.asciiBoard[2][16] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][14] = '(';
			asciiArt.asciiBoard[3][15] = 'H';
			asciiArt.asciiBoard[3][16] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][14] = '(';
			asciiArt.asciiBoard[4][15] = 'B';
			asciiArt.asciiBoard[4][16] = ')';
		}
	}

	public static void position21(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][20] = '(';
			asciiArt.asciiBoard[5][21] = 'T';
			asciiArt.asciiBoard[5][22] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][20] = '(';
			asciiArt.asciiBoard[2][21] = 'W';
			asciiArt.asciiBoard[2][22] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][20] = '(';
			asciiArt.asciiBoard[3][21] = 'S';
			asciiArt.asciiBoard[3][22] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][20] = '(';
			asciiArt.asciiBoard[4][21] = 'D';
			asciiArt.asciiBoard[4][22] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][24] = '(';
			asciiArt.asciiBoard[5][25] = 'C';
			asciiArt.asciiBoard[5][26] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][24] = '(';
			asciiArt.asciiBoard[2][25] = 'I';
			asciiArt.asciiBoard[2][26] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][24] = '(';
			asciiArt.asciiBoard[3][25] = 'H';
			asciiArt.asciiBoard[3][26] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][24] = '(';
			asciiArt.asciiBoard[4][25] = 'B';
			asciiArt.asciiBoard[4][26] = ')';
		}
	}

	public static void position22(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][30] = '(';
			asciiArt.asciiBoard[5][31] = 'T';
			asciiArt.asciiBoard[5][32] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][30] = '(';
			asciiArt.asciiBoard[2][31] = 'W';
			asciiArt.asciiBoard[2][32] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][30] = '(';
			asciiArt.asciiBoard[3][31] = 'S';
			asciiArt.asciiBoard[3][32] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][30] = '(';
			asciiArt.asciiBoard[4][31] = 'D';
			asciiArt.asciiBoard[4][32] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][34] = '(';
			asciiArt.asciiBoard[5][35] = 'C';
			asciiArt.asciiBoard[5][36] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][34] = '(';
			asciiArt.asciiBoard[2][35] = 'I';
			asciiArt.asciiBoard[2][36] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][34] = '(';
			asciiArt.asciiBoard[3][35] = 'H';
			asciiArt.asciiBoard[3][36] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][34] = '(';
			asciiArt.asciiBoard[4][35] = 'B';
			asciiArt.asciiBoard[4][36] = ')';
		}
	}

	public static void position23(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][40] = '(';
			asciiArt.asciiBoard[5][41] = 'T';
			asciiArt.asciiBoard[5][42] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][40] = '(';
			asciiArt.asciiBoard[2][41] = 'W';
			asciiArt.asciiBoard[2][42] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][40] = '(';
			asciiArt.asciiBoard[3][41] = 'S';
			asciiArt.asciiBoard[3][42] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][40] = '(';
			asciiArt.asciiBoard[4][41] = 'D';
			asciiArt.asciiBoard[4][42] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][44] = '(';
			asciiArt.asciiBoard[5][45] = 'C';
			asciiArt.asciiBoard[5][46] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][44] = '(';
			asciiArt.asciiBoard[2][45] = 'I';
			asciiArt.asciiBoard[2][46] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][44] = '(';
			asciiArt.asciiBoard[3][45] = 'H';
			asciiArt.asciiBoard[3][46] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][44] = '(';
			asciiArt.asciiBoard[4][45] = 'B';
			asciiArt.asciiBoard[4][46] = ')';
		}
	}

	public static void position24(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][50] = '(';
			asciiArt.asciiBoard[5][51] = 'T';
			asciiArt.asciiBoard[5][52] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][50] = '(';
			asciiArt.asciiBoard[2][51] = 'W';
			asciiArt.asciiBoard[2][52] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][50] = '(';
			asciiArt.asciiBoard[3][51] = 'S';
			asciiArt.asciiBoard[3][52] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][50] = '(';
			asciiArt.asciiBoard[4][51] = 'D';
			asciiArt.asciiBoard[4][52] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][54] = '(';
			asciiArt.asciiBoard[5][55] = 'C';
			asciiArt.asciiBoard[5][56] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][54] = '(';
			asciiArt.asciiBoard[2][55] = 'I';
			asciiArt.asciiBoard[2][56] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][54] = '(';
			asciiArt.asciiBoard[3][55] = 'H';
			asciiArt.asciiBoard[3][56] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][54] = '(';
			asciiArt.asciiBoard[4][55] = 'B';
			asciiArt.asciiBoard[4][56] = ')';
		}
	}

	public static void position25(Player player) {
		
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][60] = '(';
			asciiArt.asciiBoard[5][61] = 'T';
			asciiArt.asciiBoard[5][62] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][60] = '(';
			asciiArt.asciiBoard[2][61] = 'W';
			asciiArt.asciiBoard[2][62] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][60] = '(';
			asciiArt.asciiBoard[3][61] = 'S';
			asciiArt.asciiBoard[3][62] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][60] = '(';
			asciiArt.asciiBoard[4][61] = 'D';
			asciiArt.asciiBoard[4][62] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][64] = '(';
			asciiArt.asciiBoard[5][65] = 'C';
			asciiArt.asciiBoard[5][66] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][64] = '(';
			asciiArt.asciiBoard[2][65] = 'I';
			asciiArt.asciiBoard[2][66] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][64] = '(';
			asciiArt.asciiBoard[3][65] = 'H';
			asciiArt.asciiBoard[3][66] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][64] = '(';
			asciiArt.asciiBoard[4][65] = 'B';
			asciiArt.asciiBoard[4][66] = ')';
		}
	}

	public static void position26(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][70] = '(';
			asciiArt.asciiBoard[5][71] = 'T';
			asciiArt.asciiBoard[5][72] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][70] = '(';
			asciiArt.asciiBoard[2][71] = 'W';
			asciiArt.asciiBoard[2][72] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][70] = '(';
			asciiArt.asciiBoard[3][71] = 'S';
			asciiArt.asciiBoard[3][72] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][70] = '(';
			asciiArt.asciiBoard[4][71] = 'D';
			asciiArt.asciiBoard[4][72] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][74] = '(';
			asciiArt.asciiBoard[5][75] = 'C';
			asciiArt.asciiBoard[5][76] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][74] = '(';
			asciiArt.asciiBoard[2][75] = 'I';
			asciiArt.asciiBoard[2][76] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][74] = '(';
			asciiArt.asciiBoard[3][75] = 'H';
			asciiArt.asciiBoard[3][76] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][74] = '(';
			asciiArt.asciiBoard[4][75] = 'B';
			asciiArt.asciiBoard[4][76] = ')';
		}
	}

	public static void position27(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][80] = '(';
			asciiArt.asciiBoard[5][81] = 'T';
			asciiArt.asciiBoard[5][82] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][80] = '(';
			asciiArt.asciiBoard[2][81] = 'W';
			asciiArt.asciiBoard[2][82] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][80] = '(';
			asciiArt.asciiBoard[3][81] = 'S';
			asciiArt.asciiBoard[3][82] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][80] = '(';
			asciiArt.asciiBoard[4][81] = 'D';
			asciiArt.asciiBoard[4][82] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][84] = '(';
			asciiArt.asciiBoard[5][85] = 'C';
			asciiArt.asciiBoard[5][86] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][84] = '(';
			asciiArt.asciiBoard[2][85] = 'I';
			asciiArt.asciiBoard[2][86] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][84] = '(';
			asciiArt.asciiBoard[3][85] = 'H';
			asciiArt.asciiBoard[3][86] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][84] = '(';
			asciiArt.asciiBoard[4][85] = 'B';
			asciiArt.asciiBoard[4][86] = ')';
		}
	}

	public static void position28(Player player) {
	
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][90] = '(';
			asciiArt.asciiBoard[5][91] = 'T';
			asciiArt.asciiBoard[5][92] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][90] = '(';
			asciiArt.asciiBoard[2][91] = 'W';
			asciiArt.asciiBoard[2][92] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][90] = '(';
			asciiArt.asciiBoard[3][91] = 'S';
			asciiArt.asciiBoard[3][92] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][90] = '(';
			asciiArt.asciiBoard[4][91] = 'D';
			asciiArt.asciiBoard[4][92] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][94] = '(';
			asciiArt.asciiBoard[5][95] = 'C';
			asciiArt.asciiBoard[5][96] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][94] = '(';
			asciiArt.asciiBoard[2][95] = 'I';
			asciiArt.asciiBoard[2][96] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][94] = '(';
			asciiArt.asciiBoard[3][95] = 'H';
			asciiArt.asciiBoard[3][96] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][94] = '(';
			asciiArt.asciiBoard[4][95] = 'B';
			asciiArt.asciiBoard[4][96] = ')';
		}
	}

	public static void position29(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][100] = '(';
			asciiArt.asciiBoard[5][101] = 'T';
			asciiArt.asciiBoard[5][102] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][100] = '(';
			asciiArt.asciiBoard[2][101] = 'W';
			asciiArt.asciiBoard[2][102] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][100] = '(';
			asciiArt.asciiBoard[3][101] = 'S';
			asciiArt.asciiBoard[3][102] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][100] = '(';
			asciiArt.asciiBoard[4][101] = 'D';
			asciiArt.asciiBoard[4][102] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][104] = '(';
			asciiArt.asciiBoard[5][105] = 'C';
			asciiArt.asciiBoard[5][106] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][104] = '(';
			asciiArt.asciiBoard[2][105] = 'I';
			asciiArt.asciiBoard[2][106] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][104] = '(';
			asciiArt.asciiBoard[3][105] = 'H';
			asciiArt.asciiBoard[3][106] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][104] = '(';
			asciiArt.asciiBoard[4][105] = 'B';
			asciiArt.asciiBoard[4][106] = ')';
		}
	}

	public static void position30(Player player) {
		BoardLogic.Go_To_Jail(player);
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[5][110] = '(';
			asciiArt.asciiBoard[5][111] = 'T';
			asciiArt.asciiBoard[5][112] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[2][110] = '(';
			asciiArt.asciiBoard[2][111] = 'W';
			asciiArt.asciiBoard[2][112] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[3][110] = '(';
			asciiArt.asciiBoard[3][111] = 'S';
			asciiArt.asciiBoard[3][112] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[4][110] = '(';
			asciiArt.asciiBoard[4][111] = 'D';
			asciiArt.asciiBoard[4][112] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[5][114] = '(';
			asciiArt.asciiBoard[5][115] = 'C';
			asciiArt.asciiBoard[5][116] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[2][114] = '(';
			asciiArt.asciiBoard[2][115] = 'I';
			asciiArt.asciiBoard[2][116] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[3][114] = '(';
			asciiArt.asciiBoard[3][115] = 'H';
			asciiArt.asciiBoard[3][116] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[4][114] = '(';
			asciiArt.asciiBoard[4][115] = 'B';
			asciiArt.asciiBoard[4][116] = ')';
		}
	}

	public static void position31(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[11][123] = '(';
			asciiArt.asciiBoard[11][124] = 'T';
			asciiArt.asciiBoard[11][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[10][115] = '(';
			asciiArt.asciiBoard[10][116] = 'W';
			asciiArt.asciiBoard[10][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[10][123] = '(';
			asciiArt.asciiBoard[10][124] = 'S';
			asciiArt.asciiBoard[10][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[11][115] = '(';
			asciiArt.asciiBoard[11][116] = 'D';
			asciiArt.asciiBoard[11][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[12][119] = '(';
			asciiArt.asciiBoard[12][120] = 'C';
			asciiArt.asciiBoard[12][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[10][119] = '(';
			asciiArt.asciiBoard[10][120] = 'I';
			asciiArt.asciiBoard[10][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[12][115] = '(';
			asciiArt.asciiBoard[12][116] = 'H';
			asciiArt.asciiBoard[12][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[11][119] = '(';
			asciiArt.asciiBoard[11][120] = 'B';
			asciiArt.asciiBoard[11][121] = ')';
		}
	}

	public static void position32(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[15][123] = '(';
			asciiArt.asciiBoard[15][124] = 'T';
			asciiArt.asciiBoard[15][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[14][115] = '(';
			asciiArt.asciiBoard[14][116] = 'W';
			asciiArt.asciiBoard[14][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[14][123] = '(';
			asciiArt.asciiBoard[14][124] = 'S';
			asciiArt.asciiBoard[14][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[15][115] = '(';
			asciiArt.asciiBoard[15][116] = 'D';
			asciiArt.asciiBoard[15][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[16][119] = '(';
			asciiArt.asciiBoard[16][120] = 'C';
			asciiArt.asciiBoard[16][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[14][119] = '(';
			asciiArt.asciiBoard[14][120] = 'I';
			asciiArt.asciiBoard[14][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[16][115] = '(';
			asciiArt.asciiBoard[16][116] = 'H';
			asciiArt.asciiBoard[16][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[15][119] = '(';
			asciiArt.asciiBoard[15][120] = 'B';
			asciiArt.asciiBoard[15][121] = ')';
		}
	}

	public static void position33(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[19][123] = '(';
			asciiArt.asciiBoard[19][124] = 'T';
			asciiArt.asciiBoard[19][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[18][115] = '(';
			asciiArt.asciiBoard[18][116] = 'W';
			asciiArt.asciiBoard[18][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[18][123] = '(';
			asciiArt.asciiBoard[18][124] = 'S';
			asciiArt.asciiBoard[18][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[19][115] = '(';
			asciiArt.asciiBoard[19][116] = 'D';
			asciiArt.asciiBoard[19][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[20][119] = '(';
			asciiArt.asciiBoard[20][120] = 'C';
			asciiArt.asciiBoard[20][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[18][119] = '(';
			asciiArt.asciiBoard[18][120] = 'I';
			asciiArt.asciiBoard[18][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[20][115] = '(';
			asciiArt.asciiBoard[20][116] = 'H';
			asciiArt.asciiBoard[20][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[19][119] = '(';
			asciiArt.asciiBoard[19][120] = 'B';
			asciiArt.asciiBoard[19][121] = ')';
		}

	}

	public static void position34(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[23][123] = '(';
			asciiArt.asciiBoard[23][124] = 'T';
			asciiArt.asciiBoard[23][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[22][115] = '(';
			asciiArt.asciiBoard[22][116] = 'W';
			asciiArt.asciiBoard[22][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[22][123] = '(';
			asciiArt.asciiBoard[22][124] = 'S';
			asciiArt.asciiBoard[22][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[23][115] = '(';
			asciiArt.asciiBoard[23][116] = 'D';
			asciiArt.asciiBoard[23][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[24][119] = '(';
			asciiArt.asciiBoard[24][120] = 'C';
			asciiArt.asciiBoard[24][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[22][119] = '(';
			asciiArt.asciiBoard[22][120] = 'I';
			asciiArt.asciiBoard[22][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[24][115] = '(';
			asciiArt.asciiBoard[24][116] = 'H';
			asciiArt.asciiBoard[24][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[23][119] = '(';
			asciiArt.asciiBoard[23][120] = 'B';
			asciiArt.asciiBoard[23][121] = ')';
		}

	}

	public static void position35(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[27][123] = '(';
			asciiArt.asciiBoard[27][124] = 'T';
			asciiArt.asciiBoard[27][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[26][115] = '(';
			asciiArt.asciiBoard[26][116] = 'W';
			asciiArt.asciiBoard[26][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[26][123] = '(';
			asciiArt.asciiBoard[26][124] = 'S';
			asciiArt.asciiBoard[26][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[27][115] = '(';
			asciiArt.asciiBoard[27][116] = 'D';
			asciiArt.asciiBoard[27][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[28][119] = '(';
			asciiArt.asciiBoard[28][120] = 'C';
			asciiArt.asciiBoard[28][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[26][119] = '(';
			asciiArt.asciiBoard[26][120] = 'I';
			asciiArt.asciiBoard[26][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[28][115] = '(';
			asciiArt.asciiBoard[28][116] = 'H';
			asciiArt.asciiBoard[28][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[27][119] = '(';
			asciiArt.asciiBoard[27][120] = 'B';
			asciiArt.asciiBoard[27][121] = ')';
		}
	}

	public static void position36(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[31][123] = '(';
			asciiArt.asciiBoard[31][124] = 'T';
			asciiArt.asciiBoard[31][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[30][115] = '(';
			asciiArt.asciiBoard[30][116] = 'W';
			asciiArt.asciiBoard[30][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[30][123] = '(';
			asciiArt.asciiBoard[30][124] = 'S';
			asciiArt.asciiBoard[30][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[31][115] = '(';
			asciiArt.asciiBoard[31][116] = 'D';
			asciiArt.asciiBoard[31][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[32][119] = '(';
			asciiArt.asciiBoard[32][120] = 'C';
			asciiArt.asciiBoard[32][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[30][119] = '(';
			asciiArt.asciiBoard[30][120] = 'I';
			asciiArt.asciiBoard[30][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[32][115] = '(';
			asciiArt.asciiBoard[32][116] = 'H';
			asciiArt.asciiBoard[32][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[31][119] = '(';
			asciiArt.asciiBoard[31][120] = 'B';
			asciiArt.asciiBoard[31][121] = ')';
		}
	}

	public static void position37(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[35][123] = '(';
			asciiArt.asciiBoard[35][124] = 'T';
			asciiArt.asciiBoard[35][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[34][115] = '(';
			asciiArt.asciiBoard[34][116] = 'W';
			asciiArt.asciiBoard[34][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[34][123] = '(';
			asciiArt.asciiBoard[34][124] = 'S';
			asciiArt.asciiBoard[34][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[35][115] = '(';
			asciiArt.asciiBoard[35][116] = 'D';
			asciiArt.asciiBoard[35][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[36][119] = '(';
			asciiArt.asciiBoard[36][120] = 'C';
			asciiArt.asciiBoard[36][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[34][119] = '(';
			asciiArt.asciiBoard[34][120] = 'I';
			asciiArt.asciiBoard[34][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[36][115] = '(';
			asciiArt.asciiBoard[36][116] = 'H';
			asciiArt.asciiBoard[36][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[35][119] = '(';
			asciiArt.asciiBoard[35][120] = 'B';
			asciiArt.asciiBoard[35][121] = ')';
		}

	}

	public static void position38(Player player) {
		BoardLogic.Luxury_Tax(player);
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[39][123] = '(';
			asciiArt.asciiBoard[39][124] = 'T';
			asciiArt.asciiBoard[39][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[38][115] = '(';
			asciiArt.asciiBoard[38][116] = 'W';
			asciiArt.asciiBoard[38][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[38][123] = '(';
			asciiArt.asciiBoard[38][124] = 'S';
			asciiArt.asciiBoard[38][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[39][115] = '(';
			asciiArt.asciiBoard[39][116] = 'D';
			asciiArt.asciiBoard[39][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[40][119] = '(';
			asciiArt.asciiBoard[40][120] = 'C';
			asciiArt.asciiBoard[40][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[38][119] = '(';
			asciiArt.asciiBoard[38][120] = 'I';
			asciiArt.asciiBoard[38][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[40][115] = '(';
			asciiArt.asciiBoard[40][116] = 'H';
			asciiArt.asciiBoard[40][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[39][119] = '(';
			asciiArt.asciiBoard[39][120] = 'B';
			asciiArt.asciiBoard[39][121] = ')';
		}

	}

	public static void position39(Player player) {
		if (player.getPiece().equals("Thimble")) {
			asciiArt.asciiBoard[43][123] = '(';
			asciiArt.asciiBoard[43][124] = 'T';
			asciiArt.asciiBoard[43][125] = ')';
		}
		if (player.getPiece().equals("Wheel Barrel")) {
			asciiArt.asciiBoard[42][115] = '(';
			asciiArt.asciiBoard[42][116] = 'W';
			asciiArt.asciiBoard[42][117] = ')';
		}
		if (player.getPiece().equals("Shoe")) {
			asciiArt.asciiBoard[42][123] = '(';
			asciiArt.asciiBoard[42][124] = 'S';
			asciiArt.asciiBoard[42][125] = ')';
		}
		if (player.getPiece().equals("Dog")) {
			asciiArt.asciiBoard[43][115] = '(';
			asciiArt.asciiBoard[43][116] = 'D';
			asciiArt.asciiBoard[43][117] = ')';
		}
		if (player.getPiece().equals("Car")) {
			asciiArt.asciiBoard[44][119] = '(';
			asciiArt.asciiBoard[44][120] = 'C';
			asciiArt.asciiBoard[44][121] = ')';
		}
		if (player.getPiece().equals("Iron")) {
			asciiArt.asciiBoard[42][119] = '(';
			asciiArt.asciiBoard[42][120] = 'I';
			asciiArt.asciiBoard[42][121] = ')';
		}
		if (player.getPiece().equals("Hat")) {
			asciiArt.asciiBoard[44][115] = '(';
			asciiArt.asciiBoard[44][116] = 'H';
			asciiArt.asciiBoard[44][117] = ')';
		}
		if (player.getPiece().equals("Battleship")) {
			asciiArt.asciiBoard[43][119] = '(';
			asciiArt.asciiBoard[43][120] = 'B';
			asciiArt.asciiBoard[43][121] = ')';
		}
	}
	private static void reinitializeBoard() {
		for (int i = 0; i < asciiArt.asciiBoard.length; i++) {
			for (int j = 0; j < asciiArt.asciiBoard[i].length; j++) {
				asciiArt.asciiBoard[i][j] = asciiArt.asciiBoardCopy[i][j];
			}
		
		}
//		asciiArt.asciiBoard = asciiArt.asciiBoardCopy.clone();
	}
}