package com.qy.constance;

import lombok.Getter;

public class AppointmentConstance {
    @Getter
    public enum status{
        PENDING("pending"),
        CONFIRMED("confirmed"),
        REJECTED("rejected"),
        COMPLETED("completed"),
        CANCELLED("cancelled");
        private final String value;
        status(String value){
            this.value=value;
        }
        @Override
        public String toString() {
            return this.value;
        }
    }
}
