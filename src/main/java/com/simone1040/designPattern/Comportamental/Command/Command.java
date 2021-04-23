package com.simone1040.designPattern.Comportamental.Command;

public abstract class Command {
    public Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public abstract boolean execute();
}
