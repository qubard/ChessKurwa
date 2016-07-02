package es.blueberrypancak.chesskurwa;
import java.awt.Color;

public class Config {
	
	public static final Color LIGHT_GRAY = new Color(119,119,119);
	public static final Color DARK_GRAY = new Color(51,51,51);
	public static final Color BEIGE = new Color(240,217,181);
	public static final Color DARK_BEIGE = new Color(181,136,99);
	public static final Color WHITE = new Color(255,255,255);
	public static final Color BLACK = new Color(0,0,0);
	public static final Color RED = new Color(255,0,0);
	
	public static final Color S1 = new Color(181,152,142);
	public static final Color S2 = new Color(231,217,181);
	public static final Color S3 = new Color(223,166,99);
	public static final Color Y1 = new Color(202,191,167);
	public static final Color Y2 = new Color(240,217,158);
	public static final Color Y3 = new Color(215,136,99);
	
	public static final int WIDTH = 544;
	public static final int TILE_WIDTH = 68;
	
	public static final int moveTime = 500;
	public static final int threadTime = 100;
	
	public static final int mouseDelay = 50;
	
	public static final String stockfish = "stockfish-7-x64.exe";
	
	public static final Piece[] pieces = { 
			new Piece('r',851),
			new Piece('n',1439),
			new Piece('b',829),
			new Piece('q',918),
			new Piece('k',640),
			new Piece('p',1061),
			new Piece('R',342),
			new Piece('N',305),
			new Piece('B',282),
			new Piece('Q',434),
			new Piece('K',289),
			new Piece('P',138),
	};
}
