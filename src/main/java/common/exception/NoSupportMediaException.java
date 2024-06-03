package common.exception;

public class NoSupportMediaException extends PlaceRushOrderException{
	
	public NoSupportMediaException() {
		super("Error: Media(s) is(are) not supported for rush delivery!");
	}

}
