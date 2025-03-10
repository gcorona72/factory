package org.example;

interface Button {
    void render();
    void onClick(Runnable f);
}