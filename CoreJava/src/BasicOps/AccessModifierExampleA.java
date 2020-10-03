package BasicOps;

public class AccessModifierExampleA {
	private int pvy = 0;
	public char pbl;
	static String stat = "";
	public final String lang = "Java";
	
	public void methodPublic(int arg1) {
		System.out.println("Setting pvy to:"+arg1);
		methodPrivate(arg1);
	}
	
	private void methodPrivate(int arg1) {
		pvy = arg1;
	}
	
	protected void methodProtected() {
		System.out.println("The current value of pvy is:"+pvy);
	}
	
	static void methodStatic() {
		stat = "SimpliLearn";
		System.out.println("The current value of stat is:"+stat);
	}
}
