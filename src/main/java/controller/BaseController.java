package controller;

import java.util.List;

import entity.Cart.Cart;
import entity.Cart.CartMedia;
import entity.Media.Media;

public class BaseController {
    
    /**
     * The method checks whether the Media in Cart, if it were in, we will return the CartMedia else return null
     * @param media
     * @return CartMedia or null
     */
    @SuppressWarnings("exports")
    public CartMedia checkMediaInCart(Media media){
        return Cart.getCart().checkMediaInCart(media);
    }

    /**
     * This method gets the list of items in cart
     * @return List[CartMedia]
     */
    @SuppressWarnings("rawtypes")
    public List getListCartMedia(){
        return Cart.getCart().getListMedia();
    }
}
