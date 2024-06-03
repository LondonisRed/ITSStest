package common.exception;

public class InvalidRushOrderInfoException extends PlaceRushOrderException{
	public InvalidRushOrderInfoException() {
		super("Error: The input is invalid!");
	}
}
