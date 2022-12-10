package com.example.extension;

import net.minestom.server.extensions.Extension;

public class ExampleExtension extends Extension {
    @Override
    public void initialize() {
        System.out.println("Hello from extension!");
    }

    @Override
    public void terminate() {
        System.out.println("Goodbye from extension!");
    }
}
