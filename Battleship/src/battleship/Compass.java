/**
 * 
 */
package battleship;

/**
 * @author adrianolopes
 *
 */
public enum Compass {
	NORTH ('n'), 
	SOUTH ('s'), 
	EAST ('e'),
	WEST ('o'), 
	
	
	Compass(char c) {
		this.c = c;
	}
	
	public String toString() {
		return ""+c;
	}

}
