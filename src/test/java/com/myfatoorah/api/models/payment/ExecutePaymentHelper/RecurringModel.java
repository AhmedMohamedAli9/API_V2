package com.myfatoorah.api.models.payment.ExecutePaymentHelper;

public class RecurringModel {
    private String RecurringType;
    private int IntervalDays;
    private int Iteration;
    private int RetryCount;

    public int getIteration() {
        return Iteration;
    }

    public void setIteration(int iteration) {
        Iteration = iteration;
    }

    public String getRecurringType() {
        return RecurringType;
    }

    public void setRecurringType(String recurringType) {
        RecurringType = recurringType;
    }

    public int getIntervalDays() {
        return IntervalDays;
    }

    public void setIntervalDays(int intervalDays) {
        IntervalDays = intervalDays;
    }

    public int getRetryCount() {
        return RetryCount;
    }

    public void setRetryCount(int retryCount) {
        RetryCount = retryCount;
    }

    public RecurringModel(String recurringType, int intervalDays, int iteration, int retryCount) {
        RecurringType = recurringType;
        IntervalDays = intervalDays;
        Iteration = iteration;
        RetryCount = retryCount;
    }
}
