
public class Generator {
    public static void main(String[] args)
    {
        Window MainWindow = new Window(750, 400, "Name Generator");
        MainWindow.setResizable(false);
        MainWindow.addText("<html><h1>Name Generator</h1></html>", 275, 10, 715, 20);
        MainWindow.addText("<html><h5><center>Created by Aj The Goat</center></h5></html>", 315, 340, 715, 20);
        MainWindow.setVisible(true);
       
    }
}
