package test.interface1;

public class V50 implements SmartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		System.out.println(phoneNumber+"에 전화를 건다.");

	}

	@Override
	public void receiveCall(String phoneNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSMS(String phoneNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveSMS(String phoneNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public String searchMusic(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void playMusic(String music) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub

	}

	@Override
	public void installApp(String appName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void runApp(String appName) {
		// TODO Auto-generated method stub

	}

}
