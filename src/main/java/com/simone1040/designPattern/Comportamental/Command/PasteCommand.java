package com.simone1040.designPattern.Comportamental.Command;

public class PasteCommand extends Command{

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
