package com.ruleengine.drools;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleController {
	@Autowired
	private KieContainer kieContainer;

	@PostMapping("/employee")
	public Employee applyRules(@RequestBody Employee employee) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(employee);
		kieSession.fireAllRules();
		kieSession.dispose();
		return employee;
	}
}
