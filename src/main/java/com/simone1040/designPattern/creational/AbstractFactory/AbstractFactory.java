package com.simone1040.designPattern.creational.AbstractFactory;

import com.simone1040.designPattern.creational.AbstractFactory.model.Button;
import com.simone1040.designPattern.creational.AbstractFactory.model.LinuxButton;
import com.simone1040.designPattern.creational.AbstractFactory.model.WindowsButton;

public class AbstractFactory extends GuiFactory {
    @Override
    public Button createButton(TypeGui gui) {
        switch (gui){
            case LinuxGui:
                return new LinuxButton();
            case WindowsGui:
                return new WindowsButton();
        }
        return null;
    }
}
