package hw07;
interface MusicCreator { public Number play(); }
abstract class StringInstrument { public Long play() {return 3L; } }

// Class name Violin has been changed to Q48
public class Q48 extends StringInstrument implements MusicCreator {
	public Long play() {
		return 12L;
	}
}
