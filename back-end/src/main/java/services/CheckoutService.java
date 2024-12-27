package services;

import models.Checkout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CheckoutRepository;

@Service
public class CheckoutService extends BaseService<Checkout, Long>{
    private final CheckoutRepository checkoutRepository;

    @Autowired
    public CheckoutService(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    @Override
    protected CheckoutRepository getRepository() {return checkoutRepository;}

    @Override
    protected Checkout updateEntity(Checkout existingCheckout, Checkout checkoutDetail) {
        existingCheckout.setCheckoutDate(checkoutDetail.getCheckoutDate());
        existingCheckout.setDueDate(checkoutDetail.getDueDate());
        existingCheckout.setReturnDate(checkoutDetail.getReturnDate());
        existingCheckout.setUser(checkoutDetail.getUser());
        return existingCheckout;
    }


}
