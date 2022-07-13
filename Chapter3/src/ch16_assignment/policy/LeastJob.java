package ch16_assignment.policy;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("L 대기 적음: getNextCall");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("L 대기 적음: sendCallToAgent");
	}

}
