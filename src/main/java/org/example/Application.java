package org.example;

public class Application {
    private Dialog dialog;

    // La aplicación elige un tipo de creador dependiendo de la
    // configuración actual o los ajustes del entorno.
    public void initialize() throws Exception {
        String config = readApplicationConfigFile();

        if ("Windows".equals(config)) {
            dialog = new WindowsDialog();
        } else if ("Web".equals(config)) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
    }

    // El código cliente funciona con una instancia de un
    // creador concreto, aunque a través de su interfaz base.
    // Siempre y cuando el cliente siga funcionando con el
    // creador a través de la interfaz base, puedes pasarle
    // cualquier subclase del creador.
    public static void main(String[] args) throws Exception {
        Application app = new Application();
        app.initialize();
        app.dialog.render();
    }

    private String readApplicationConfigFile() {
        // Simulate reading a configuration file
        return "Windows"; // or "Web"
    }
}