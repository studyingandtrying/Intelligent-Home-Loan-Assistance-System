package com.qy.constance;

import lombok.Getter;

public class HouseConstance {
    public static final String DEPOSIT_ONE_ONE = "1";
    public static final String DEPOSIT_ONE_THREE = "3";
    public static final String DEPOSIT_YEAR = "12";

    @Getter
    public enum HouseType {
        WHOLE("whole"),
        SHARED("shared"),
        SINGLE("single");

        private final String value;

        HouseType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

    @Getter
    public enum HouseStatus{
        PENDING("pending"),
        ACTIVE("active"),
        INACTIVE("INACTIVE"),
        REJECTED("rejected");
        private final String value;
        HouseStatus(String value){
            this.value=value;
        }

        @Override
        public String toString(){
            return this.value;
        }
    }
}