package ch16_assignment.policy;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("P 우선순위: getNextCall");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("P 우선순위: sendCallToAgent");
	}

}
