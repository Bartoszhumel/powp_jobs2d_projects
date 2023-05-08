package edu.kis.powp.jobs2d.drivers.decorator;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.features.RecordFeature;

public class RecordingDriver extends DriverDecorator {

    public RecordingDriver(Job2dDriver driver) {
        super(driver);
    }

    @Override
    public void setPosition(int x, int y) {
        RecordFeature.recordCommand(new SetPositionCommand(x,y));
        super.setPosition(x,y);
    }

    @Override
    public void operateTo(int x, int y) {
        RecordFeature.recordCommand(new OperateToCommand(x,y));
        super.operateTo(x,y);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}