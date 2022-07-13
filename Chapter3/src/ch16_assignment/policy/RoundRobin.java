package ch16_assignment.policy;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("R 순서대로: getNextCall");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("R 순서대로: sendCallToAgent");
	}

}
