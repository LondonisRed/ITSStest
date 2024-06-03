package common.exception;

public class NoSupportAddressException extends PlaceRushOrderException{
	public NoSupportAddressException(){
		super("Error:Your address is not supported for rush delivery!");
	}
}
