package LockedMe.com;
public class MainLockedMe {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		OperationFiles.createMainFolderIfNotPresent("main");
		
		OptionsforMenu.printWelcomeScreen("LockedMe", "MOHD MALIK");
		
		HandlingOptions.handleWelcomeScreenInput();
	}

	
}