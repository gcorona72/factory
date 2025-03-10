package org.example;

        abstract class Dialog {
            // La creadora también puede proporcionar cierta
            // implementación por defecto del método fábrica.
            abstract Button createButton();

            // Observa que, a pesar de su nombre, la principal
            // responsabilidad de la creadora no es crear productos.
            // Normalmente contiene cierta lógica de negocio que depende
            // de los objetos de producto devueltos por el método
            // fábrica. Las subclases pueden cambiar indirectamente esa
            // lógica de negocio sobrescribiendo el método fábrica y
            // devolviendo desde él un tipo diferente de producto.
            public void render() {
                // Invoca el método fábrica para crear un objeto de
                // producto.
                Button okButton = createButton();
                // Ahora utiliza el producto.
                okButton.onClick(() -> closeDialog());
                okButton.render();
            }

            private void closeDialog() {
                // Implementación para cerrar el diálogo
            }
        }