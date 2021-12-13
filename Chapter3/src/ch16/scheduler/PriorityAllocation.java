package ch16.scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Get calls of helpline from the queue in order.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Allocate calls to experienced counselors.");
	}

}
