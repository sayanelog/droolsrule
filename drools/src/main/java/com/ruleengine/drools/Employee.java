package com.ruleengine.drools;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
	private String grade;
    private String location;
    private String invoiceType;
    private double amountIndividual;
    private double monthlyCap;
    private boolean eligible;
}
