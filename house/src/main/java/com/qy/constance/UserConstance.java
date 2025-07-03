package com.qy.constance;

import lombok.Getter;


public class UserConstance {
    @Getter
    public enum role{
        TENANT("tenant"),
        LANDLORD("landlord"),
        ADMIN("admin");

        private final String value;
        role(String value){
            this.value=value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }
    @Getter
    public enum status{
        ACTIVE("active"),
        INACTIVE("inactive"),
        BANNED("banned");

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
