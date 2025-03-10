package org.example;

class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}