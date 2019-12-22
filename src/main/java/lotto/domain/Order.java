package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int payment;
    private List<String> selfNumbers;

    public int getPayment() {
        return payment;
    }

    public List<String> getSelfNumbers() {
        return selfNumbers;
    }

    private Order(Builder builder) {
        this.payment = builder.payment;
        this.selfNumbers = builder.selfNumbers;
    }

    public static class Builder {

        private int payment = 0;
        private List<String> selfNumbers = new ArrayList<>();

        public Builder() {
        }

        public Builder payment(int payment) {
            this.payment = payment;
            return this;
        }

        public Builder selfNumber(List<String> selfNumber) {
            this.selfNumbers = selfNumber;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
