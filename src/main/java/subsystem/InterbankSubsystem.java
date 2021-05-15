package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import controller.PlaceOrderController;
import entity.payment.ACard;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;
import subsystem.interbank.InterbankSubsystemController;

/***
 * The {@code InterbankSubsystem} class is used to communicate with the
 * Interbank to make transaction.
 *
 * @author hieud
 *
 */
// design pattern: singleton
public class InterbankSubsystem implements InterbankInterface {


	private static InterbankSubsystem instance;

	public static InterbankSubsystem getInstance() {
		if (instance == null) {
			instance = new InterbankSubsystem();
		}
		return instance;
	}

	private InterbankSubsystem() {
		this.ctrl = new InterbankSubsystemController();
	}
	/**
	 * Represent the controller of the subsystem
	 */
	private InterbankSubsystemController ctrl;

	/**
	 * Initializes a newly created {@code InterbankSubsystem} object so that it
	 * represents an Interbank subsystem.
	 */
//	public InterbankSubsystem() {
//		this.ctrl = new InterbankSubsystemController();
//	}

	/**
	 * @see InterbankInterface#payOrder(entity.payment.ACard, int,
	 *      String)
	 */
	public PaymentTransaction payOrder(ACard card, int amount, String contents) {
		PaymentTransaction transaction = ctrl.payOrder(card, amount, contents);
		return transaction;
	}

	/**
	 * @see InterbankInterface#refund(CreditCard, int,
	 *      String)
	 */
	//stamp coupling
	// cleancode: loai bo phuong thuc ko su dung
//	public PaymentTransaction refund(CreditCard card, int amount, String contents) {
//		PaymentTransaction transaction = ctrl.refund(card, amount, contents);
//		return transaction;
//	}
}
