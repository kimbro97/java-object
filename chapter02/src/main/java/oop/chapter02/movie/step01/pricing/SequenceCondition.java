package oop.chapter02.movie.step01.pricing;

import oop.chapter02.movie.step01.DiscountCondition;
import oop.chapter02.movie.step01.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
