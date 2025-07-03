package com.qy.constance;

import lombok.Getter;

public class ReviewConstance {
    @Getter
    public enum rating{
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5);
        private final Integer value;
        rating(Integer value){
            this.value=value;
        }

        @Override
        public String toString() {
            return this.value.toString();
        }
    }
}
