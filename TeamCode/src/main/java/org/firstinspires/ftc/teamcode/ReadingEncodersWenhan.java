package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class ReadingEncodersWenhan extends OpMode {
    //declares variables
    DcMotor motor=null;
    double motorPower;

    @Override
    public void init() {
        motor=hardwareMap.dcMotor.get("motor");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }


    @Override
    public void loop() {
        int encoderCounts=motor.getCurrentPosition();
        telemetry.addData("Encoder Reading",encoderCounts);


    }
}
