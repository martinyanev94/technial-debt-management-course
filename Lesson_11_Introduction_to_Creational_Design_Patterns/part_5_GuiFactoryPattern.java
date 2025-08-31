interface Button {
    void paint();
}

class WindowsButton implements Button {
    public void paint() {
        System.out.println("Windows Button");
    }
}

class MacOSButton implements Button {
    public void paint() {
        System.out.println("MacOS Button");
    }
}

interface GUIFactory {
    Button createButton();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}

class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }
}
