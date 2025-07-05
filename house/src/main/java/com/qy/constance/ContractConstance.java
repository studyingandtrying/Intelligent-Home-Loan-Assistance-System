package com.qy.constance;

import lombok.Getter;

public class ContractConstance {
    @Getter
    public enum status{
        DRAFT("draft"),
        SIGNED("signed"),
        ACTIVE("active"),
        EXPIRED("expired"),
        TERMINATED("terminated");
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
