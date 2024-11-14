package lab;

class CellPhone{
	public void RcvCall() {
		System.out.println("Calling");
	}
}
interface MediaPlayer{
     void playAudio();
     void playVideo();
}
interface GPS{
	void findLoc();
}
interface camera{
	void TakePic();
}

class Smartphone extends CellPhone implements MediaPlayer,GPS,camera {
	public void playAudio() {
		System.out.println("Playing Audio");
	}
    public void playVideo() {
    	System.out.println("Playing Video");
    }
    public void findLoc() {
    	System.out.println("Finding Location");
    }
    public void TakePic() {
    	System.out.println("Taking Picture");
    }
}
public class MultipleInheritence {
	public static void main(String[]args) {
		Smartphone vivo= new Smartphone();
		vivo.playAudio();
	}
}
