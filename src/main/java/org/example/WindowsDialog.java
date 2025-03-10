package org.example;

        import java.awt.*;

        class WindowsDialog extends Dialog {
            @Override
            Button createButton() {
                return new WindowsButton();
            }
        }