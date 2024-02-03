package oop.chapter02.movie.step01.pricing;

import oop.chapter02.money.Money;
import oop.chapter02.movie.step01.DiscountCondition;
import oop.chapter02.movie.step01.DiscountPolicy;
import oop.chapter02.movie.step01.Movie;
import oop.chapter02.movie.step01.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
