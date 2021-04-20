package com.simone1040.designPattern.creational.AbstractFactory;

import com.simone1040.designPattern.creational.AbstractFactory.model.Button;
import com.simone1040.designPattern.creational.AbstractFactory.model.GuiFactory;
import com.simone1040.designPattern.creational.AbstractFactory.model.LinuxButtonRounded;
import com.simone1040.designPattern.creational.AbstractFactory.model.WindowsButtonRounded;

public class AbstractFactoryRounded extends GuiFactory {
    @Override
    public Button createButton(TypeGui gui) {
        switch(gui){
            case LinuxGui:
                return new LinuxButtonRounded();
            case WindowsGui:
                return new WindowsButtonRounded();
        }
        return null;
    }
}
