package controller;

import entity.cart.Cart;
import entity.user.User;
import subsystem.interbank.InterbankPayloadConverter;

import java.time.LocalDateTime;

/**
 * @author
 * singleton: can phuong thuc private constructor de dam bao SessionInformation chi truy cap cac bien static
 */
public class SessionInformation {

    private User mainUser; // 
    private Cart cartInstance;
    private LocalDateTime expiredTime;

    private static SessionInformation instance;

    public static SessionInformation getInstance(){
        if(instance == null){
            instance = new SessionInformation();
        }
        return instance;
    }

    private SessionInformation(){
        cartInstance = Cart.getInstance();
    }

    public User getMainUser() {
        return mainUser;
    }

    public void setMainUser(User mainUser) {
        this.mainUser = mainUser;
    }

    public Cart getCartInstance() {
        return cartInstance;
    }

    public void setCartInstance(Cart cartInstance) {
        this.cartInstance = cartInstance;
    }

    public LocalDateTime getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(LocalDateTime expiredTime) {
        this.expiredTime = expiredTime;
    }
}
