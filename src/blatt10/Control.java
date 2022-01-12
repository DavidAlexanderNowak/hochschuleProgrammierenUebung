package blatt10;

public class Control {
	public static void main(String args[]) {
//		exercise10_6();
//		exercise10_7();
		exercise10_8();
		
//		testing();
	}

	private static void testing() {
//		SysTextFile textFileA = new SysTextFile("A", "Txt");
//		textFileA.setText("Text A");
//		SysDirectory directoryA= new SysDirectory("One down", textFileA);
//		SysDirectory topDirectory = new SysDirectory("Top", directoryA);
//		
//		System.out.println(topDirectory.dirStructure(""));
	}
	
	private static void exercise10_6() {
		SysTextFile stf = new SysTextFile("Hello", "java");
		stf.setText("public class HelloWorld{/*...*/}");
		System.out.printf("%s:\n %s\n\n", stf, stf.getText());
	}

	private static void exercise10_7() {
		SysTextFile hello = new SysTextFile("Hello", "java");
		hello.setText("public class HelloWorld{/*...*/}");
		SysTextFile test = new SysTextFile("Test", "java");
		SysTextFile prt = new SysTextFile("PrintClass", "java");
		SysDirectory srcDir = new SysDirectory("SRC", hello, test, prt);
		SysTextFile todo = new SysTextFile("Todos", "txt");
		SysTextFile toget = new SysTextFile("Eggs", "rtm");
		SysDirectory txtDir = new SysDirectory("txt", todo, toget);
		SysDirectory home = new SysDirectory("home", srcDir, txtDir);
		srcDir.setName("SRC");
		toget.setName("Einkaufsliste");
		home.setName("HOME");
		home.setOwner("brul0001");
		System.out.printf("%s\n", home);
	}

	private static void exercise10_8() {
		SysTextFile hello = new SysTextFile("Hello", "java");
		hello.setText("public class HelloWorld{/*...*/}");
		SysTextFile test = new SysTextFile("Test", "java");
		SysTextFile prt = new SysTextFile("PrintClass", "java");
		SysDirectory srcDir = new SysDirectory("SRC", hello, test, prt);
		SysTextFile todo = new SysTextFile("Todos", "txt");
		SysTextFile toget = new SysTextFile("Eggs", "rtm");
		SysDirectory txtDir = new SysDirectory("txt", todo, toget);
		SysDirectory home = new SysDirectory("home", srcDir, txtDir);
		srcDir.setName("SRC");
		toget.setName("Einkaufsliste");
		home.setName("HOME");
		home.setOwner("brul0001");
//		System.out.printf("%s\n", home);
		System.out.printf("%s\n", home.dirStructure(""));
	}

}