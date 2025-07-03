package com.qy.constance;

import lombok.Getter;

public class FinanceRecordConstance {
    @Getter
    public enum type{
        INCOME("income"),
        EXPENSE("expense");

        private final String value;
        type(String value){
            this.value=value;
        }
        @Override
        public String toString() {
            return this.value;
        }
    }
}
